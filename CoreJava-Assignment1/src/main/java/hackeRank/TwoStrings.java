package hackeRank;

import java.io.IOException;
import java.util.Scanner;

public class TwoStrings {

	static String twoStringsSolve(String s1, String s2) {
		String output="";
		int i=0;
		for (char c : s1.toCharArray()) {
			if(s2.contains(String.valueOf(c))) {
				output="YES";
				i++;
				break;
			}
//			output=(s2.contains(String.valueOf(c)))?"YES":"NO";
		}			
		System.out.println(i);
		return output;
	}
	// Complete the twoStrings function below.
	//	static String twoStringsSolve(String s1, String s2) {
	//		for (char c : s1.toCharArray()) {
	//			for (char d : s2.toCharArray()) {
	//				if(c==d) {
	//					return "YES";
	//				}
	//			}
	//		}
	//		return "NO";
	//	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String one="sam";
		String two="bsamB";
		System.out.println(twoStringsSolve(one, two));
	}
}
