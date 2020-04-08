package linked_list;

public class DoublyLinkedList implements InterfaceLinkedList {
	private DoublyNode first;
	private DoublyNode last;

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	void setLastNode(DoublyNode _node) {
		last = _node;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public DoublyIterator getIterator() {
		return new DoublyIterator(this, first);
	}
	
	public void insertAtFront(int data) {
		DoublyNode _node = new DoublyNode(data);
		if (this.isEmpty())
			last = _node;
		else {
			first.setPrev(_node);
			_node.setNext(first);
		}
		first = _node;
	}

	public void insertAtEnd(int data) {
		DoublyNode _node = new DoublyNode(data);
		if (this.isEmpty())
			first = _node;
		else {
			last.setNext(_node);
			_node.setPrev(last);
		}
		last = _node;
	}

	public void insertAfter(DoublyNode before, int data) {
		if (before == null)
			throw new NullPointerException("the given node is null");
		DoublyNode _node = new DoublyNode(data);
		_node.setNext(before.getNext());
		_node.setPrev(before);
		if (_node.getNext() == null)
			last = _node;
		else
			before.getNext().setPrev(_node);
		before.setNext(_node);
	}

	public void insertBefore(DoublyNode after, int data) {
		if (after == null)
			throw new NullPointerException("the given node is null");
		DoublyNode _node = new DoublyNode(data);
		_node.setNext(after);
		_node.setPrev(after.getPrev());
		if (_node.getPrev() == null)
			first = _node;
		else
			after.getPrev().setNext(_node);
		after.setPrev(_node);
	}
	
	public int deleteFirst() {
		if (this.isEmpty())
			throw new NegativeArraySizeException("this linked list is empty");
		int ret = first.getData();
		first = first.getNext();
		if (this.isEmpty())
			last = null;
		else
			first.setPrev(null);
		return ret;
	}

	public int deleteLast() {
		if (this.isEmpty())
			throw new NegativeArraySizeException("this linked list is empty");
		int ret = last.getData();
		last = last.getPrev();
		if (last == null)
			first = null;
		else
			last.setNext(null);
		return ret;
	}

	public void printAll() {
		for (DoublyNode cur = first; cur != null; cur = cur.getNext())
			System.out.println(cur.getData());
	}
}