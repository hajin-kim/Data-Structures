package linked_list;

class Node {
	private int data;
	private Node next;

	Node(int _data) {
		data = _data;
		next = null;
	}

	int getData() {
		return data;
	}

	void setData(int _data) {
		data = _data;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node node) {
		next = node;
	}
}