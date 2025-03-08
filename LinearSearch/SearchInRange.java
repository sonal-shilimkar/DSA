package LinearSearch;

public class SearchInRange {
	//Search in an array but within the given range
	
	public static void main(String[] args) {
		
		int[] arr = {5,6,1, 66, 7, 8, 0};
		 int target = 7;
		 
		 int ans = search(target, arr,0,4);
		 if(ans ==1) {
			 System.out.print("Found!");
		 }
		 else {
			 System.out.print("Not Found!");
		 }

		}

		public static int search(int target, int[] arr, int start, int end) {
			for(int i=start; i<=end; i++) {
				 if(arr[i] == target) {
					 return 1;
					
				 }
			 }
			 return -1;
		}

}
