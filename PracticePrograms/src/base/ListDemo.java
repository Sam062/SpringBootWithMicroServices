package base;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(101);
		list.add(101);
		list.add(101);
		list.add(2, 1000);
		System.out.println(list);
	}
}
