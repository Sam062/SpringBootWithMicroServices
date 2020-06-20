package assignment1;

import java.util.SortedSet;
import java.util.TreeSet;

public class Array_FindThirdLargest {

	//1st, 2nd AND 3rd LARGEST VALUE USING COLLECTION
	public static void main1(String[] args) {
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
	//1st, 2nd AND 3rd LARGEST VALUE USING ARRAY
	public static void main2(String[] args) {
		//		int[] arr={ 6, 8, 1};
		int[] arr={ 6, 8, 1, 9, 2, 1, 10, 12};

		if(arr.length<3)
			System.out.println("ARRAY HAVE LESS THAN 3 ELEMENTS");
		else {
			int firstLargest=arr[0],
					secondLargest=0,
					thirdLargest=0;

			for (int i = 1; i < arr.length; i++) {
				if(arr[i]>firstLargest) {
					thirdLargest=secondLargest;
					secondLargest=firstLargest;
					firstLargest=arr[i];
				}
				else if(arr[i]>secondLargest) {
					thirdLargest=secondLargest;
					secondLargest=arr[i];
				}
				else if(arr[i]>thirdLargest)
					thirdLargest=arr[i];
			}

			System.out.println("Largest="+firstLargest);
			System.out.println("2nd Largest="+secondLargest);
			System.out.println("3rd Largest="+thirdLargest);
		}
	}
	//1st, 2nd AND 3rd LARGEST VALUE USING ARRAY
	public static void main(String[] args) {
		int[] arr={ 6, 8, 1, 9, 2, 1, 10,50,50, 12};
		int first=arr[0],second=0,third=0;
		for (int i = 0; i < arr.length; i++) {
			if(first<arr[i])
				first=arr[i];
		}
		System.out.println("1st="+first);
		for (int i = 0; i < arr.length; i++) {
			if(second<arr[i] && first>arr[i])
				second=arr[i];
		}
		System.out.println("2nd="+second);
		for (int i = 0; i < arr.length; i++) {
			if(third<arr[i] && arr[i]<second)
				third=arr[i];
		}
		System.out.println("3rd="+third);
	}
}
