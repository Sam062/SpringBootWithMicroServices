package assignment1;

public class Array_PairSum {
	public static void main(String[] args) {
		int[] arr={3, 6, 8, -8, 10, 8 };
		int sum=14;
		
		for (int i = 0; i < arr.length; i++) {
			int temp=arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if((arr[j]+temp)==sum)
					System.out.println("Pair =("+arr[i]+","+arr[j]+")");
			}
		}
	}

}
