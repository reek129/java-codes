package practise.search;

public class LinearSearch {

	int array[];

	public LinearSearch(int[] a) {
		super();
		this.array = a;
	}

	// Time Complexity O(n)
	public boolean search(int x) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == x)
				return true;
		}

		return false;

	}
}
