package base;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapDuplicateValue {
	public static void main(String[] args) {
		final Map<Integer, String> map = new HashMap<>();
		map.put(101, "SAM");
		map.put(102, "ADARSH");
		map.put(103, "UTK");
		map.put(104, "SAM");
		map.put(105, "UTK");

		System.out.println(map);
		//				 USING DIRECT FOREACH************************************************
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		map.entrySet().forEach(a->treeMap.put(a.getValue(), a.getKey()));
		System.out.println(treeMap);
		//				******************************************************************

		//		Map<String,Integer> collect= map.entrySet().stream().collect(
		//				Collectors.toMap(
		//						a->{
		//							Entry<Integer, String> e=(Entry<Integer, String>)a;
		//							return e.getValue();
		//						},
		//						a->{
		//							Entry<Integer, String> e=(Entry<Integer, String>)a;
		//							return e.getKey();
		//						})
		//				);
		//		System.out.println(collect);
	}
}
