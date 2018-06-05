package practise.search;

public class Main {

	public static void main(String[] args) {

		int arr[]= {5,6,8,00,123,456,753,56};
		
		LinearSearch ls= new LinearSearch(arr);
		System.out.println(ls.search(8));
		System.out.println(ls.search(9));
		
		int sortedArr[]= {4,6,8,89,90,123,245,678,9900};
		
		BinarySearch bs= new BinarySearch(sortedArr);
		JumpSearch js= new JumpSearch(sortedArr);
		
		
		System.out.println(bs.search(0, sortedArr.length, 90));
		
		System.out.println(js.search(245));
	}

}
