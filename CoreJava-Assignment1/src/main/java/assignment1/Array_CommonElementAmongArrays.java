package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Array_CommonElementAmongArrays {
	public static void main(String[] args) {

		int[] arr1={ 1, 5, 10, 20, 40, 80 };
		int[] arr2={ 6, 7, 20, 80, 100,10 };
		int[] arr3={ 3, 4, 15, 20, 30, 70,10, 80, 120 };

		List<Integer> commonElement=new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {
			int temp=arr1[i];
			for (int j = 0; j < arr2.length; j++) {
				int temp1=arr2[j];
				if(arr2[j]==temp)
					for (int k = 0; k < arr3.length; k++) {
						if(temp1==arr3[k])
							commonElement.add(arr1[i]);
					}
			}
		}
		System.out.println(commonElement);
	}

}
