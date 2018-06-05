package practise.search;

public class JumpSearch {

	int array[];

	public JumpSearch(int[] array) {
		super();
		this.array = array;
	}
//	Aim: fewer steps than linear steps
	public boolean search(int searchNo) {
		
		   int n = array.length;
		   
	        int step = (int)Math.floor(Math.sqrt(n));
	        int prev = 0;
	        while (array[Math.min(step, n)-1] < searchNo)
	        {
	            prev = step;
	            step += (int)Math.floor(Math.sqrt(n));
	            if (prev >= n)
	                return false;
	        }
	 
	        while (array[prev] < searchNo)
	        {
	            prev++;
	            if (prev == Math.min(step, n))
	                return false;
	        }
	        if (array[prev] == searchNo)
	            return true;
	 
		return false;
		
	}
}
