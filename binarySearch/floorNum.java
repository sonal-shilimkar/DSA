package binarySearch;

public class floorNum {

	// floor no. means find no from an array
	//which is largest but smaller than or equals to target element.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = {2,5,6,40,45,60,77};
				//int target = 42;  					
				// 42 is not present in an array so search element which is greater than 42 but smallest from an array

				//int target = 88;
				
				/*
				 * int[] arr = {2, 5, 7, 9, 12, 16}; int target = 6;
				 */
				
				
				  int[] arr = {1, 4, 6, 8, 10, 15, 20}; int target = 5;
				 
				//  int[] arr = {1, 4, 6, 8, 10, 15, 20}; int target = 0;
				
				/*
				 * int[] arr = {3, 5, 8, 10, 11, 14}; int target = 3;
				 */
				
				System.out.println(findFloor(target, arr));
			}
			
			public static int findFloor(int target, int[] arr) {
				int start =  0;
				int last = arr.length-1;
				
				if(target < arr[start]) {
					return -1;
				}
				while(start <= last) {
					int mid = (start + last) / 2;
					
					if(arr[mid] == target) {
						return arr[mid];
					}
					
					if(target < arr[mid]) {
						last = mid - 1;
					}
					else {
						start = mid + 1;
					}
				}
				return arr[last];
			}

}