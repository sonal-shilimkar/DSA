package binarySearch;

import java.util.Arrays;

public class startAndEndPos {

	//Given an array find the starting position of the target series and the ending position
	
	public static void main(String[] args) {

		int[] arr = {5,7,7,7,7,8,8,10};
		int target = 7;
		
		int[] ans = findPos(arr, target);
		
		System.out.print(Arrays.toString(ans));
	}
	
	public static int[] findPos(int[] arr, int target) {
		
		int[] ans = {-1,-1};
		int s = binarySearch(target,arr,true);
		int e = binarySearch(target,arr,false);
		
		ans[0] = s;
		ans[1] = e;
		
		return ans;
	}
	
	public static int binarySearch(int target, int[] arr, boolean isLeft) {
		
		int ans = -1;
		int start =  0;
		int last = arr.length-1;
		
		while(start <= last) {
			int mid = (start + last) / 2;
			
			if(target < arr[mid]) {
				last = mid - 1;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				ans = mid;
				if(isLeft) {
					last = mid-1;
				}
				else {
					start = mid+1;
				}
			}
		}
		return ans;
	}

}
