package assignment1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Array_FindDuplicate {
	public static void main(String[] args) {
		int[] arr= {1,2,5,5,6,6,7,2};

		Set<Integer> set=new LinkedHashSet<>();
		Set<Integer> duplicateElements=new TreeSet<>();
		for (int i = 0; i < arr.length; i++) {
			boolean flag=set.add(arr[i]);
			if(flag==false)
				duplicateElements.add(arr[i]);
		}
		System.out.println("DUPLICATE ELEMENTS ="+duplicateElements);
	}
}
