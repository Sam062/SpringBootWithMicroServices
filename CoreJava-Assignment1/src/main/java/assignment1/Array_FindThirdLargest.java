package assignment1;

import java.util.SortedSet;
import java.util.TreeSet;

public class Array_FindThirdLargest {
	public static void main(String[] args) {
		//				int[] arr={2};
		int[] arr={ 6, 8, 1, 9, 2, 1, 10, 12};
		if(arr.length<3)
			System.out.println("ARRAY HAVE LESS THAN 3 ELEMENTS");
		else {
			SortedSet<Integer> set=new TreeSet<>((i1,i2)->i2.compareTo(i1));
			for (int i = 0; i < arr.length; i++) {
				set.add(arr[i]);
			}
			System.out.println(set);
			Object[] arr1=set.toArray();
			int thirdLargest=(Integer)arr1[2];

			System.out.println(thirdLargest);

		}

	}



}
