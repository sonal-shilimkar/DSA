package LinearSearch;

public class SearchInString {

	public static void main(String[] args) {
		String s = "Hello World";			//It will be case sensitive
		char target = 'W';
		
		int ans = search(target, s);
		 if(ans ==1) {
			 System.out.print("Found!");
		 }
		 else {
			 System.out.print("Not Found!");
		 }

		}

		public static int search(char target, String arr) {
			for(int i=0; i<arr.length(); i++) {
				 if(arr.charAt(i) == target) {
					 return 1;
					
				 }
			 }
			 return -1;
		}
}
