package array;

public class DescendingSortedArray extends Array implements InterfaceSortedArray {
	public DescendingSortedArray(int _size) {
		super(_size);
	}

	public void setData(int index, int new_value) {
		this.deleteAt(index);
		this.insert(new_value);
	}

	public void insert(int item) {
		if (size == 0) {
			super.insertAtEnd(item);
		}

		int _index = this.binarySearch(item);
		if (item < int_array[_index]) ++_index;

		super.insertAt(_index, item);
	}

	public void insertAt(int index, int item) {
		this.insert(item);
	}

	public void insertAtEnd(int item) {
		this.insert(item);
	}

	public int search(int item) {
		// binary search
		int _index = this.binarySearch(item);
		if (_index == -1)
			throw new NegativeArraySizeException("array is empty");
		if (int_array[_index] == item)
			return _index;
		return -1;
	}

	public int binarySearch(int item) {
		int left = 0, right = size-1, mid;

		while (left < right) {
			mid = (left + right) / 2;
			if (item < int_array[mid]) left = mid + 1;
			else right = mid;
		}
		return right;
	}
}