package base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringReverseWithoutNumber {
	public static void main(String[] args) {
		String s="abcd15ef6abcabcabc8";
		System.out.println(s);
		
		char[] arr = s.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		StringBuilder s1=new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--) {
			if(arr[i]>=48&&arr[i]<=56) {
				map.put(Character.valueOf(arr[i]), Integer.valueOf(i));
			}
			else
				s1.append(arr[i]);
		}
		List<Character> asList = new ArrayList<>();
		for (Character character : s1.toString().toCharArray()) {
			asList.add(character);
		}
		map.entrySet().stream().forEach(
				a->asList.add((int) a.getValue(), Character.valueOf(a.getKey()))
				);
		StringBuilder output=new StringBuilder();
		asList.forEach(a->output.append(a));
		System.out.println(output);

	}

}
