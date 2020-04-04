package linked_list;

public interface InterfaceIterator {
	boolean atEnd();
	int getData();
	void next();
	void insertAfter(int data);
	int deleteCurrent();
}