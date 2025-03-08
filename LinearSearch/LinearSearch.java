package LinearSearch;

public class LinearSearch {

	public static void main(String[] args) {
	 int[] arr = {5,6,1, 66, 7, 8, 0};
	 int target = 7;
	 
	 int ans = search(target, arr);
	 if(ans ==1) {
		 System.out.print("Found!");
	 }
	 else {
		 System.out.print("Not Found!");
	 }

	}

	public static int search(int target, int[] arr) {
		for(int i=0; i<arr.length; i++) {
			 if(arr[i] == target) {
				 return 1;
				
			 }
		 }
		 return -1;
	}
}
