package linked_list;

public class LinkedList implements InterfaceLinkedList {
	private Node first;
	private Node last;

	public LinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public Iterator getIterator() {
		return new Iterator(this, first);
	}

	public void insertAtFront(int data) {
		Node _node = new Node(data);
		if (this.isEmpty())
			last = _node;
		else
			_node.setNext(first);
		first = _node;
	}

	public void insertAfter(Node before, int data) {
		if (before == null)
			throw new NullPointerException("the given node is null");
		Node _node = new Node(data);
		_node.setNext(before.getNext());
		before.setNext(_node);
		if (_node.getNext() == null)
			last = _node;
	}

	public void insertAtEnd(int data) {
		Node _node = new Node(data);
		if (this.isEmpty())
			first = _node;
		else 
			last.setNext(_node);
		last = _node;
	}

	public int deleteFirst() {
		if (this.isEmpty())
			throw new NegativeArraySizeException("this linked list is empty");
		int ret = first.getData();
		first = first.getNext();
		if (this.isEmpty())
			last = null;
		return ret;
	}

	public void printAll() {
		for (Node cur = first; cur != null; cur = cur.getNext())
			System.out.println(cur.getData());
	}

	void setLastNode(Node _node) {
		last = _node;
	}
}