package LinearSearch;

public class NumberOfDigitsAreEven {
//Check if the digits present in a number are even
// Ex:  num:2  - Not Even,  num:3333 - Even
	
	public static void main(String[] args) {
		
		int[] arr = {43, 5, 66, 789, 4215, 4, 50};
		System.out.print(countEven(arr));
		
	}
	
	public static int countEven(int[] arr) {
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			int num = (int)(Math.log10(arr[i])) + 1;
			
			if(num %2 == 0) {
				count++;
			}
		}
		return count;
	}

}
