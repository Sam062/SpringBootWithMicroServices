package assignment2;

public class ZerosAndOnes {
	public static void main(String[] args) {
		int[] arr= {0,1,0,1,0,1,0,1};
		/*
		 * **************************************************************
		 *  SOLUTION 1 -----------------
		 * Arrays.sort(arr); for (int i = 0; i < arr.length; i++) {
		 * System.out.print(arr[i]+" "); } System.out.println();
		 * ***************************************************************
		 */

//		for (int i = 0; i < arr.length-1; i++) {
//			if(arr[i]==1) {
//				int temp=arr[i];
//				arr[i]=arr[i+1];
//				arr[arr.length-1]=temp;
//
//			}
//		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}



	}

}
