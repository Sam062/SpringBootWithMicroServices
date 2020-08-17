package hackeRank;

public class ReferenceAndPrimitiveVar {
	public static void changeArrayElement(int[] arr) {
		arr[1]=1111;
	}
	public static int changePrimitive(int i) {
		return i=2222;
	}

	public static Integer changeWrapper(Integer i) {
		i=3333;
		return i;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};

		changeArrayElement(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("****************************");

		int i=5;
		changePrimitive(i);
		System.out.println(i);

		System.out.println("****************************");
		Integer integer=new Integer(10);
		changeWrapper(integer); 
		//Value not changed Because Integer is a wrapper class and All Wrapper classes are  Immutable
		System.out.println(integer);

	}

}
