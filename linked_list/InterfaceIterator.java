package linked_list;

interface InterfaceIterator {
	boolean atEnd();
	int getData();
	void next();
	void insertAfter(int data);
	int deleteCurrent();
}