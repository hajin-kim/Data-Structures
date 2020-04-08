package linked_list;

class DoublyNode {
	private int data;
	private DoublyNode next;
	private DoublyNode prev;

	DoublyNode(int _data) {
		data = _data;
		next = null;
		prev = null;
	}

	int getData() {
		return data;
	}

	void setData(int _data) {
		data = _data;
	}

	DoublyNode getNext() {
		return next;
	}

	void setNext(DoublyNode node) {
		next = node;
	}

	DoublyNode getPrev() {
		return prev;
	}

	void setPrev(DoublyNode node) {
		prev = node;
	}
}