package binarySearch;

public class binarySearchImpl {

	/*
	 * It searches in sorted array, It will divide array into two parts by finding
	 * mid first. If target element is greater then mid then search in right side of
	 * the array [i.e] start = mid+1 If its less than mid then search in left side
	 * of the array [i.e] end = mid-1
	 * 
	 * Complexity: O(log n)
	 */
	
	public static void main(String[] args) {

		int[] arr = {2,5,7,20,34,70,88};
		int target = 2;
		
		System.out.println(binarySearch(target, arr));

	}
	
	public static boolean binarySearch(int target, int[] arr) {
		
		int start =  0;
		int last = arr.length-1;
		
		while(start <= last) {
			int mid = (start + last) / 2;
			
			if(arr[mid] == target) {
				return true;
			}
			
			if(target < arr[mid]) {
				last = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return false;
	}

}
