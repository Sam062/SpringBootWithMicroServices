package assignment2;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7}; 	// OUTPUT- 5 , 6 , 7 , 1 , 2 , 3 , 4
		int pos=3;
		if(pos<0 || pos>=arr.length-1)
			System.out.println("INVALID POSITION");
		else {
			System.out.println("Original Array=");
			for (int i : arr) {
				System.out.print(i+" ");
			}
			System.out.println();

			int[] temp=new int[pos+1];

			//		Storing till Pos index in temp array
			for (int i = 0; i<pos+1 ; i++) {
				temp[i]=arr[i];
			}

			/*			Storing Afetr Pos index in temp array
						int[] temp1=new int[arr.length-pos-1];
						for (int i = pos+1,j=0; i <arr.length&&j<temp1.length; i++,j++) {
							temp1[j]=arr[i];
						}

						int j=0;
						for (int i = 0; i < arr.length; i++) {
							if(i<temp1.length)
								arr[i]=temp1[i];
							else {
								arr[i]=temp[j];
								j++;
							}
			 		}
			 */
			int j=0;
			//Shifting and storing temp1 
			for (int i = 0; i < arr.length; i++) {
				if(i<arr.length-pos)
					arr[i]=arr[i+pos];
				else {
					arr[i]=temp[j];
					j++;
				}

			}


			System.out.println("Rotated Array=");
			for (int i : arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
