package assignment1;

import java.util.Set;
import java.util.TreeSet;

public class Array_RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr= {1, 6, 4, 3, 2, 2, 3, 8, 1};
		Set<Integer> set=new TreeSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		int sum=0;
		for (Integer integer : set) {
			sum+=integer;
		}
		System.out.println(sum);
	}

}
