package practise.search;

public class BinarySearch {

	int array[];

	public BinarySearch(int[] array) {
		super();
		this.array = array;
	}

	// works on sorted Array
	// Time complexity theata(log n)
	public boolean search(int leftIndex, int rightIndex, int searchNumber) {
		if (rightIndex >= leftIndex) {
			int mid = leftIndex + (rightIndex - leftIndex) / 2;
			if (array[mid] == searchNumber)
				return true;
			if (array[mid] > searchNumber)
				return search(leftIndex, mid - 1, searchNumber);

			return search(mid + 1, rightIndex, searchNumber);
		}
		return false;
	}
}
