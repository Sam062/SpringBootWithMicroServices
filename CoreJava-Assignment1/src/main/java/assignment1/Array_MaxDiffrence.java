package assignment1;

import java.util.Arrays;

public class Array_MaxDiffrence {
	public static void main(String[] args) {
		int[] arr={ 9, 2, 12, 5, 4, 7, 3, 19, 5};

		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[arr.length-1];
		System.out.println("MAX="+max);
		System.out.println("MIN="+min);
		System.out.println("MAX DIFFERENCE="+(max-min));
	}

}
