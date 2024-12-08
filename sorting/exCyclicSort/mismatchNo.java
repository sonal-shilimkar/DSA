package sorting.exCyclicSort;

import java.util.ArrayList;
import java.util.Arrays;

public class mismatchNo {

	//Probl:  From an array 1 to N one no. is mismatched find the duplicate element and the missing no.
	//ex: arr = {4,2,3,2}
	//ans: [2,1]   :// 2 is duplicate no. and 1 is the missing no.
	
	public static void main(String[] args) {
		
		int[] arr = {4,2,3,2};
		
		int i = 0;
		
		while(i < arr.length) {
			
			if( arr[i] != arr[arr[i] -1]) {
				swap(arr, i, arr[i]-1);
			}
			else {
				i++;
			}
		}
		
		System.out.print(Arrays.toString(findMissing(arr)));
		
	}
	
	public static void swap(int[] arr, int first, int second) {
		int tmp = arr[first];
		arr[first] = arr[second];
		arr[second] = tmp;
	}
	
	public static int[] findMissing(int[] arr) {
		int[] ans = new int[2];
		for(int j=0; j<arr.length; j++) {
			if(arr[j]-1 != j && arr[j] == arr[(arr[j])-1]) {
				ans[0] = arr[j];								//Duplicate element
				ans[1]=j+1;									//missing element
				return ans;
			}
		}
		return new int[] {-1,-1};
	}

}
