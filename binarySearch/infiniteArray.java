package binarySearch;

/*Search an element from an infinite array. that means we don't knoe the length of an array.
Solution:  search in chunks. rather than dividing the array we can start from 0,1 position 
and then increase the size of chunks exponentially.*/


public class infiniteArray {

	public static void main(String[] args) {
		int[] arr = {2,5,7,20,34,70,88};
		int target = 70;
		
		//System.out.println(binarySearch(target, arr));
		int start = 0;
		int last = 1;
		
		while(target > arr[last]) {
			int newStart = last +1;
			last = last + (last -start +1) *2;
			start = newStart;
		}
		System.out.println(binarySearch(target, arr,start, last));

	}
	
	public static boolean binarySearch(int target, int[] arr, int start, int last) {
		
		/*
		 * int start = 0; int last = arr.length-1;
		 */
		
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
