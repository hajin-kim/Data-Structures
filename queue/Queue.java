package queue;
import linked_list.LinkedList;

public class Queue {
	protected final LinkedList llist;

	public Queue() {
		llist = new LinkedList();
	}

	public void enqueue(int data) {
		llist.insertAtEnd(data);
	}

	public int dequeue() {
		return llist.deleteFirst();
	}

	public boolean isEmpty() {
		return llist.isEmpty();
	}
}