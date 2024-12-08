package sorting.exCyclicSort;

import java.util.Arrays;

public class missingNo {

	//Problem: arr from 0 to N find the missing element
	
	public static void main(String[] args) {
		// for arr 0 to N check if the current index is = element 
		//if it's != index -> swap
		//then again check for an arr if element == index
		//if not it's missing element or else all elements are passed then the last element 
		// arr.length is missing element

		int[] arr = {4,1,0,3,5};
		int i = 0;
		
		while(i < arr.length) {
			
			if(arr[i]<arr.length && i != arr[i]) {
				swap(arr, i, arr[i]);
			}
			else {
				i++;
			}
		}
		
		System.out.println("Missing no. is:" + findMissing(arr));
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static void swap(int[] arr, int firstel, int lastel) {
		int tmp = arr[firstel];
		arr[firstel] = arr[lastel];
		arr[lastel] = tmp;
	}
	
	public static int findMissing(int[] arr) {
		for(int j=0; j<arr.length; j++) {
			if(arr[j] != j) {
				return j;		
			}
		}
		return arr.length;
	}

}
