package assignment1;

import java.util.Arrays;

public class Array_SecondMinMax {
	public static void main(String[] args) {
		int[] arr= {1, 2, 5, 9, 6, 4, 7, 2,55,50};
		Arrays.sort(arr);
		System.out.println("Second Min="+arr[1]);
		System.out.println("Second Max="+arr[arr.length-2]);
	}

}
