package binarySearch;

public class searchInMoutainSrr {
	//search terget element from mountain array
	// *Solution*:  
	/*
	 * 1. find peak element first; 
	 * 2. apply binary search for 0 to peak first mean check in ascending arr if present return ture 
	 * 3. if not in first half check for second half peak to length-1 
	 * 4. else return false;
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = {1,2,3,5,6,4,3,1};
		//int[] arr = {4,5,6,7,0,1,2};
		//int[] arr = {3,1};
		int[] arr = {3,5,1};
		
		System.out.println(peakElement(arr,1));

	}
	
	public static int peakElement(int[] arr,int target) {
		
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = (start+end) /2;
			
			if(arr[mid] < arr[mid+1]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		
		int peak = start;
		System.out.println("Peak:"+peak);
		if(arr[peak] == target) {
			return peak;
		}
		
		int firstHalf = binarySearch(target,arr,0,peak);
		System.out.println(firstHalf);
		if(firstHalf != -1) {
			return firstHalf;
		}
		return binarySearch(target,arr,peak+1, arr.length-1);
	}
	
	public static int binarySearch(int target, int[] arr, int start, int last) {
		
		
		while(start <= last) {
			int mid = (start + last) / 2;
			
			System.out.println("start:"+start + ", mid:"+mid+ ", end: "+last);
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(target < arr[mid]) {
				last = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
