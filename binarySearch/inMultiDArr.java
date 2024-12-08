package binarySearch;

public class inMultiDArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = { {10,20,30,40},
						{15,25,35,45},
						{28,29,37,49},
						{33,34,38,50}};
		
		int target = 50;
		
		
		System.out.println(binarySearch(arr,target));
		
		System.out.println(binarySearch2(arr,target));
		

	}
	
	//O(n*m)
	public static boolean binarySearch(int[][] arr, int target) {
		int row = 0; int col = arr.length-1;
		int n = arr.length;
		
		while(row < n && col >=0) {
			
			if( target == arr[row][col]) {
				return true;
			}
			else if( target < arr[row][col]) {
				col --;
			}
			else if(target > arr[row][col]) {
				row++;
			}
		}
		return false;
	}
	
	
	//Try 2   //O(log n*m)
	public static boolean binarySearch2(int[][] arr, int target) {
		int row = 0; int col = arr.length-1;
		
		while(row <arr.length && col >= 0) {
		if(target>= arr[row][0] && target <= arr[row][col]) {
			int[] rowArr = arr[row];
			return bs(rowArr,target);
		}
		if(target > arr[row][col]) {
			row++;
		}
		}	
		
		return false;
	}
	
	public static boolean bs(int[] arr, int target) {
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
	
	
	//can be written by (log n * log m) by finding mid of row 
	/*
	 * public static boolean binarySearch3(int[][] arr, int target) { int row = 0;
	 * int col = arr.length-1;
	 * 
	 * while(row < arr.length && col >= 0) { int mid = (row+col) /2;
	 * 
	 * 
	 * } }
	 */

}
