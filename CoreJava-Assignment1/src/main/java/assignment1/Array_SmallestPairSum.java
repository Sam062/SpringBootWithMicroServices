package assignment1;

import java.util.Arrays;

public class Array_SmallestPairSum {
	public static void main(String[] args) {
		int[] arr={1, 7, 2, 9, 6};
		Arrays.sort(arr);
		System.out.println("Smallest Pair ("+arr[0]+","+arr[1]+ ") Sum="+(arr[0]+arr[1]));
	}

}
