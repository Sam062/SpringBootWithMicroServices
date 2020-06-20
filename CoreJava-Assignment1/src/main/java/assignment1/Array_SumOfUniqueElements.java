package assignment1;

import java.util.Set;
import java.util.TreeSet;

public class Array_SumOfUniqueElements {
	public static void main(String[] args) {

		int[] arr= {1, 1, 3, 2, 2, 3};
		Set<Integer> set=new TreeSet<>();
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag=set.add(arr[i]);

			if(flag)
				sum+=arr[i];
		}
		System.out.println(set);
		System.out.println(sum);

	}

}
