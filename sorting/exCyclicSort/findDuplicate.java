package sorting.exCyclicSort;

import java.util.ArrayList;
import java.util.Arrays;

public class findDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,3,2,1,5,2,3};
		
		int i = 0;
		
		while(i < arr.length) {
			
			if( arr[i] != arr[arr[i] -1]) {
				swap(arr, i, arr[i]-1);
			}
			else {
				i++;
			}
		}
		
		System.out.println("Duplicate element is"+ findDuplicate(arr));
		
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static void swap(int[] arr, int firstel, int lastel) {
		int tmp = arr[firstel];
		arr[firstel] = arr[lastel];
		arr[lastel] = tmp;
	}

	public static ArrayList<Integer> findDuplicate(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<>();
		for(int j=0; j<arr.length; j++) {
			if(arr[j]-1 != j && arr[j] == arr[(arr[j])-1]) {
				ans.add(arr[j]);	
			}
		}
		return ans;
	}

}
