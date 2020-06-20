package assignment1;

public class Array_MinAndMax {
	public static void main(String[] args) {
		int[] arr= {0,15,1, 2, 5, 5, 6, 6, 7, 2};
		int min=arr[0], max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);
		System.out.println(max);
	}

}
