package sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// for arr 1 to N check if the current index is = element -1 (as index starts from 0)
		//if it's != index -> swap
		
		int[] arr = {4,1,6,3,2,5};
		
		int i = 0;
		
		while(i < arr.length) {
			
			if(arr[i] != arr[arr[i] -1]) {
				swap(arr, i, arr[i]-1);
			}
			else {
				i++;
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
