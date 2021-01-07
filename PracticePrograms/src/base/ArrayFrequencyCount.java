package base;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayFrequencyCount {
	public static void main(String[] args) {
		Integer[] arr= {1,5,6,2,4,1,2,3,4,5};
		List<Integer> asList = Arrays.asList(arr);
		Map<Integer, Integer> map=new HashMap<>();
		
		// Counting Frequency of Elements
//		asList.forEach(a->map.put(a, map.get(a)==null?1:map.get(a)+1));
		asList.forEach(a->map.put(a, map.containsKey(a)?map.get(a)+1:1));
		
		System.out.println(map);
		
		// Removing Duplicates
		List<Integer> collect = asList.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
