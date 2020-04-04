import array.*;
import linked_list.*;

public class Main {
	public static void main(String[] args) {
		// test code
		// Array
		{
			Array a = new Array(0);
			a.insertAtEnd(5);
			a.insertAt(0, 3);
			System.out.println(a.getData(0));
			System.out.println(a.search(3));
			System.out.println("deleted item: " + a.deleteAt(a.search(5)));
			a.setData(0, 5);
			System.out.println(a.search(5));
			System.out.println(a.getSize());
			a.printAllElements();
		}
		// AscendingSortedArray
		{
			AscendingSortedArray s = new AscendingSortedArray(1);
			s.insertAt(1, 0);
			s.insert(3);
			s.insert(1);
			s.insert(4);
			s.insert(1);
			s.insert(5);
			s.insert(9);
			s.insert(2);
			s.insert(6);
			s.insert(5);
			s.insert(3);
			s.insert(5);
			s.setData(1, 123);
			s.setData(1, 123);
			s.insertAt(1, 121);
			s.insertAt(1, 1);
			s.insertAt(1, 0);
			s.insertAt(1, 124);
			s.setData(1, 122);
			s.setData(1, 122);
			s.setData(1, 121);
			s.setData(1, 121);
			s.insertAt(1, -5);
			s.insert(0);
			System.out.println(s.search(5));
			System.out.println(s.search(10));
			System.out.println(s.getSize());
			// s.resetElements();
			// System.out.println(s.getSize());
			s.printAllElements();
		}
		// DescendingSortedArray
		{
			DescendingSortedArray s = new DescendingSortedArray(1);
			s.insertAt(1, 0);
			s.insert(3);
			s.insert(1);
			s.insert(4);
			s.insert(1);
			s.insert(5);
			s.insert(9);
			s.insert(2);
			s.insert(6);
			s.insert(5);
			s.insert(3);
			s.insert(5);
			s.setData(1, 123);
			s.setData(1, 123);
			s.insertAt(1, 121);
			s.insertAt(1, 1);
			s.insertAt(1, 0);
			s.insertAt(1, 124);
			s.setData(10, 122);
			s.setData(10, 122);
			s.setData(10, 121);
			s.setData(10, 121);
			s.insertAt(1, -5);
			s.insert(0);
			System.out.println(s.search(5));
			System.out.println(s.search(10));
			System.out.println(s.getSize());
			// s.resetElements();
			// System.out.println(s.getSize());
			s.printAllElements();
		}

		System.out.println("\nLinkedList");
		// LinkedList
		{
			LinkedList l = new LinkedList();
			// l.deleteFirst();
			l.insertAtEnd(1);
			l.insertAtFront(5);
			l.insertAtFront(4);
			l.insertAtFront(3);
			l.deleteFirst();
			l.insertAtFront(2);
			l.insertAtEnd(1);
			l.insertAtEnd(0);
			l.printAll();

			int n = 10;
			for (Iterator i = l.getIterator(); !i.atEnd(); i.next()) {
				i.insertAfter(n);
				i.deleteCurrent();
				System.out.println(i.getData());
				n += 10;
			}
		}

		// CircularLinkedList
		{
			CircularLinkedList l = new CircularLinkedList();
			// l.deleteFirst();
			l.insertAtFront(5);
			l.insertAtFront(4);
			l.insertAtFront(3);
			l.deleteFirst();
			l.insertAtFront(2);
			l.insertAtFront(1);
			l.printAll();

			int n = 10;
			for (CircularIterator i = l.getIterator(); !i.atEnd(); i.next()) {
				i.insertAfter(n);
				i.deleteCurrent();
				System.out.println(i.getData());
				n += 10;
			}
		}
	}
}