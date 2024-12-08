package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,2,5,65,1,3};
		bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	
	public static void bubbleSort(int[] arr) {
		boolean isUpdated = false;
		
		for(int i=0; i< arr.length; i++) {
			for(int j=1; j< arr.length -i; j++) {
				if(arr[j-1] > arr[j]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
					isUpdated = true;
				}
			}
			
			if(!isUpdated) {
				break;
			}
		}
	}
}
