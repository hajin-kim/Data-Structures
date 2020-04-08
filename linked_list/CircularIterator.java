package linked_list;

public class CircularIterator implements InterfaceIterator {
	private final Node header;
	private Node prev;
	private Node cur;

	public CircularIterator(Node _header) {
		header = _header;
		prev = header;
		cur = header.getNext();
	}

	public boolean atEnd() {
		return cur == header;
	}

	public int getData() {
		if (this.atEnd())
			throw new IndexOutOfBoundsException("iterator reached at the end");
		return cur.getData();
	}

	public void next() {
		if (this.atEnd())
			throw new IndexOutOfBoundsException("iterator reached at the end");
		prev = cur;
		cur = cur.getNext();
	}

	public void insertAfter(int data) {
		Node _node = new Node(data);
		_node.setNext(cur.getNext());
		cur.setNext(_node);
	}

	public int deleteCurrent() {
		if (this.atEnd())
			throw new IndexOutOfBoundsException("iterator reached at the end");
		int ret = cur.getData();
		cur = cur.getNext();
		prev.setNext(cur);
		return ret;
	}
}	