package binarySearch;

public class letterGreaterThanTarget {

	/*
	 * Problem stmnt: find a smallest char that is larger than a target Similar to
	 * ceiling no.  but its wrap a around means, if target is the last char from an array then return start only
	 	if target == char from arr do not return the same char but larger than target char
	 	means remove == condition for mid
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[]  arr = {'c','d','f','g'};
		char target = 'f';

		System.out.println(findCeiling(target, arr));
	}
	
	 public static char findCeiling(char target, char[] arr) {
		int start =  0;
		int last = arr.length-1;
		
		if(target >= arr[last]) {
			return arr[start];
		}
		
		while(start <= last) {
			int mid = (start + last) / 2;
			
			if(arr[mid] == target) {
				return arr[mid+1];
			}
			
			if(target < arr[mid]) {
				last = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return arr[start];
	}

}
