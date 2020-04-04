package linked_list;

public class CircularLinkedList implements InterfaceLinkedList {
	private final Node header;

	public CircularLinkedList() {
		header = new Node(0);
		header.setNext(header);
	}

	public boolean isEmpty() {
		return header.getNext() == header;
	}

	public CircularIterator getIterator() {
		return new CircularIterator(header);
	}

	public void insertAtFront(int data) {
		Node _node = new Node(data);
		_node.setNext(header.getNext());
		header.setNext(_node);
	}

	public int deleteFirst() {
		if (this.isEmpty())
			throw new NegativeArraySizeException("this linked list is empty");
		Node first = header.getNext();
		int ret = first.getData();
		header.setNext(first.getNext());
		return ret;
	}

	public void printAll() {
		for (Node i = header.getNext(); i != header; i = i.getNext()) {
			System.out.println(i.getData());
		}
	}
}