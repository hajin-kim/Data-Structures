package linked_list;

public class Iterator implements InterfaceIterator {
	private final LinkedList llist;
	private Node prev, cur;

	public Iterator(LinkedList _caller, Node first) {
		llist = _caller;
		prev = null;
		cur = first;
	}

	public boolean atEnd() {
		return cur == null;
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
		if (this.atEnd())
			throw new IndexOutOfBoundsException("iterator reached at the end");
		// 	Node _node = new Node(data);
		// 	node.setNext(cur.getNext());
		// 	cur.setNext(_node);
		llist.insertAfter(cur, data);
	}

	public int deleteCurrent() {
		if (this.atEnd())
			throw new IndexOutOfBoundsException("iterator reached at the end");
		int ret = cur.getData();
		cur = cur.getNext();
		if (prev == null)
			return llist.deleteFirst();
		prev.setNext(cur);
		if (this.atEnd())
			llist.setLastNode(prev);
		
		return ret;
	}
}