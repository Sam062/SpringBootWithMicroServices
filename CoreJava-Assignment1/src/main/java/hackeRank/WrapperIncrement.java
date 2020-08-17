package hackeRank;

public class WrapperIncrement {
	public static void main(String[] args) {
		Integer a=Integer.valueOf(150);   //SAME AS - Integer a=150;
		Integer b=a;
		a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
	}

}
