package LinearSearch;

public class SearchIn2DArr {

	public static void main(String[] args) {
		int[][] arr = { {2, 5, 66},
				        {4, 70, 8, 9},
				        {90, 1, 6} };

		int target = 9;
		
		 int ans = search(target, arr);
		 if(ans ==1) {
			 System.out.print("Found!");
		 }
		 else {
			 System.out.print("Not Found!");
		 }

		}

		public static int search(int target, int[][] arr) {
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
				 if(arr[i][j] == target) {
					 return 1;
				 }
				}
			 }
			 return -1;
		}

}
