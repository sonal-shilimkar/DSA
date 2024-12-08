package binarySearch;

public class peakInMountainArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,6,4,3,1};
		
		System.out.println(peakElement(arr));
		System.out.println(peakElement2(arr));

	}
	
	public static int peakElement(int[] arr) {
		
		int start = 0;
		int end = arr.length -1;
		int ans= -1;
		
		while(start <= end) {
			int mid = (start+end) /2;
			
			if(arr[mid] > arr[mid+1]) {
				ans = arr[mid];
			}
			if(arr[mid] < arr[mid+1]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return ans;
	}
	
	
	//Second solution 
	public static int peakElement2(int[] arr) {
		
		int start = 0;
		int end = arr.length -1;
		
		
		while(start <= end) {
			int mid = (start+end) /2;
			
			if(arr[mid] < arr[mid+1]) {
				start = mid+1;
			}
			else {
				end = mid;
			}
		}
		return arr[start];
	}

}
