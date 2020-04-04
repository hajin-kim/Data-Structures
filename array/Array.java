package array;

public class Array {
	protected int[] int_array;
	protected int size = 0;

	public Array(int _size) {
		if (size < 0) {
			throw new NegativeArraySizeException("array size should not be negative");
		}
		size = _size;
		int_array = new int[size];
		this.resetElements();
	}

	public void resetElements() {
		for (int i = 0; i < size; ++i) {
			int_array[i] = 0;
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isOutOfBounds(int index) {
		if (index >= size || index < 0) {
			return true;
		}
		return false;
	}

	public int getData(int index) {
		if (this.isOutOfBounds(index)) {
			throw new ArrayIndexOutOfBoundsException("index out of range");
		}
		return int_array[index];
	}

	public void setData(int index, int new_value) {
		if (this.isOutOfBounds(index)) {
			throw new ArrayIndexOutOfBoundsException("index out of range");
		}
		int_array[index] = new_value;
	}

	public int deleteAt(int index) {
		if (this.isOutOfBounds(index)) {
			throw new ArrayIndexOutOfBoundsException("index out of range");
		}
		size -= 1;
		int[] __new_array = new int[size];
		for (int i = 0; i < index; ++i) {
			__new_array[i] = int_array[i];
		}
		int ret = int_array[index];
		for (int i = index; i < size; ++i) {
			__new_array[i] = int_array[i+1];
		}
		int_array = __new_array;
		return ret;
	}

	public void insertAt(int index, int item) {
		if (this.isOutOfBounds(index) && index > size) {
			throw new ArrayIndexOutOfBoundsException("index out of range");
		}
		size += 1;
		int[] __new_array = new int[size];
		for (int i = 0; i < index; ++i) {
			__new_array[i] = int_array[i];
		}
		__new_array[index] = item;
		for (int i = index; i < size-1; ++i) {
			__new_array[i+1] = int_array[i];
		}
		int_array = __new_array;
	}

	public void insertAtEnd(int item) {
		int[] __new_array = new int[size+1];
		for (int i = 0; i < size; ++i) {
			__new_array[i] = int_array[i];
		}
		__new_array[size] = item;
		
		size += 1;
		int_array = __new_array;
	}

	public int search(int item) {
		// linear search(sequential search)
		for (int i = 0; i < size; ++i) {
			if (int_array[i] == item) {
				return i;
			}
		}
		return -1;
	}

	public void printAllElements() {
		for (int i : int_array) {
			System.out.println(i);
		}
	}
}