package base;

import java.util.Arrays;

public class ArrayMerge {
	public static int[] mergeArray(int[] arr1,int[] arr2) {
		int[] newArray=new int[(arr1.length+arr2.length)];
		int flag=0;
		for(int i=0;i<newArray.length;i++) {
			if(i<arr1.length)
				newArray[i]=arr1[i];
			else
				newArray[i]=arr2[flag++];
		}
		Arrays.sort(newArray);
		return newArray;
	}
	public static void main(String[] args) {
		int[] arr1= {-1,-1,3,5,7,9};
		int[] arr2= {-2,2,3,4,5,6};
		int[] mergeArray = mergeArray(arr1, arr2);
		for (int i = 0; i < mergeArray.length; i++) {
			System.out.println(mergeArray[i]);
		}
	}

}
