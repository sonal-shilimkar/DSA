package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// find max element in each pass and swap with last position
		// last = (arr.length - i) - 1;
		// find max i to arr.length - i;
		
		int[] arr = {8,2,90,54,3,1};
		
		for(int i=0; i< arr.length; i++) {
			
			int max = findMaxPos(arr, arr.length-i);
			swap(arr, max, (arr.length-i)-1);
		}
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static int findMaxPos(int[] arr, int last) {
		
		int max= 0;
		
		for(int i=0; i<last; i++) {
			if(arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}
	
	public static void swap(int[] arr, int firstel, int lastel) {
		int tmp = arr[firstel];
		arr[firstel] = arr[lastel];
		arr[lastel] = tmp;
	}

}
