package assignment2;

public class RightRotationArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int rotation=4;
		for (int j = 0; j < rotation; j++) {

			int temp=arr[arr.length-1];
			for (int i = arr.length-1; i >0; i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
