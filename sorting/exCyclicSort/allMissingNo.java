package sorting.exCyclicSort;

import java.util.ArrayList;
import java.util.Arrays;

public class allMissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,2,7,8,2,3,1};
		
		int i = 0;
		
		while(i < arr.length) {
			
			if( arr[i] != arr[arr[i] -1]) {
				swap(arr, i, arr[i]-1);
			}
			else {
				i++;
			}
		}
		
		System.out.println("Missing no's are:"+ findMissing(arr));
		
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static void swap(int[] arr, int firstel, int lastel) {
		int tmp = arr[firstel];
		arr[firstel] = arr[lastel];
		arr[lastel] = tmp;
	}

	public static ArrayList<Integer> findMissing(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<>();
		for(int j=0; j<arr.length; j++) {
			if(arr[j]-1 != j) {
				ans.add(j+1);	
			}
		}
		return ans;
	}
}
