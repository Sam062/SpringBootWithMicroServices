package base;

public class SecondHighestNum {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,5,5};
		int max=0;
		int secMax=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==max)
				continue;
			else if (arr[i]>secMax) 
				secMax=arr[i];
		}
		System.out.println(secMax);
	}

}
