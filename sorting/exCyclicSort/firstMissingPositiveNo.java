package sorting.exCyclicSort;

import java.util.Arrays;

public class firstMissingPositiveNo {

	//Problem:  From given unsorted array find the first positive missing element
	
	public static void main(String[] args) {

		int[] arr = {1,2,-1,3};
		
		int i=0;
		
		while(i<arr.length) {	
			if(arr[i] > 0 && arr[i] != arr[arr[i] -1]) {
				swap(arr, i, arr[i]-1);
			}
			else {
				i++;
			}
		}
		System.out.print(findMissing(arr));
	}
	
	public static void swap(int[] arr, int first, int second) {
		int tmp = arr[first];
		arr[first] = arr[second];
		arr[second] = tmp;
	}
	
	public static int findMissing(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]-1 != i) {
				return i+1;
			}
		}
		return -1;
	}

}
