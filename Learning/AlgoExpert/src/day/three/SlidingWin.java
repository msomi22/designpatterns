package day.three;

public class SlidingWin {

	public static void main(String[] args) {
		/**
		 * finding sub array - contiguous
		 * sub string
		 */
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int target = 9;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			if(sum > target) {
				
			}
			System.out.println("sum " + sum + " num " + arr[i] );
		}
		
	}

}
