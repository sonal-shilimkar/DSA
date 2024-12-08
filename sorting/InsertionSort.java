package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// commpare the sub-array's from 0 till j th element if its max move to j+1 index

		int[] arr = {87,4,2,90,5,1};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j>0; j--) {
				if(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				}
				else {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void swap(int[] arr, int firstel, int lastel) {
		int tmp = arr[firstel];
		arr[firstel] = arr[lastel];
		arr[lastel] = tmp;
	}

}
