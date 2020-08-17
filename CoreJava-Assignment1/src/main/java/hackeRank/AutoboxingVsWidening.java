package hackeRank;

import java.util.ArrayList;

public class AutoboxingVsWidening {
	static void m1(Integer val) {
		System.out.println("AutoBoxing");
	}
	static void m1(long val) {
		System.out.println("Widening");
	}
	public static void main(String[] args) {
		int val=10;
		m1(val); //here Widening is implemented... and widening proirity is more than autoboxing.
		
		System.out.println("******************");
		ArrayList<Object> arrayList = null;
		System.out.println(arrayList==null);
		
	}

}
