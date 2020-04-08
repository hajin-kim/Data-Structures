package linked_list;

public class DoublyIterator implements InterfaceIterator {
	private final DoublyLinkedList llist;
	private DoublyNode prev;
	private DoublyNode cur;

	public DoublyIterator(DoublyLinkedList _caller, DoublyNode first) {
		llist = _caller;
		prev = null;
		cur = first;
	}

	public boolean atEnd() {
		return cur == null;
	}

	public boolean atFront() {
		return prev == null;
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

	public void prev() {
		if (this.atFront())
			throw new IndexOutOfBoundsException("iterator reached at the front");
		cur = prev;
		prev = cur.getPrev();
	}

	public void insertAfter(int data) {
		if (this.atEnd())
			throw new IndexOutOfBoundsException("iterator reached at the end");
		llist.insertAfter(cur, data);
	}

	public void insertBefore(int data) {
		if (this.atEnd()) {
			llist.insertAtEnd(data);
			prev = prev.getNext();
		}
		else {
			llist.insertBefore(cur, data);
			prev = cur.getPrev();
		}
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
		else
			cur.setPrev(prev);
		
		return ret;
	}
}