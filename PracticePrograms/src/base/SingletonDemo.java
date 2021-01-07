package base;

class DemoSingle {
	private static DemoSingle ins;
	static{
		if(ins==null)
			ins=new DemoSingle();
	}
	public static DemoSingle getIns() {
		return ins;
	}

}
public class SingletonDemo{
	public static void main(String[] args) {
		System.out.println(DemoSingle.getIns());
		System.out.println(DemoSingle.getIns());
		System.out.println(DemoSingle.getIns());
	}
}
