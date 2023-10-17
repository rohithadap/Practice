package programPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class countCharStringHashmap {
	
	public static void main(String[] args) {
		
		String s = "rohit kishor hadap";
		s.replaceAll(" ", "");
		char ch[] = s.toCharArray();
		
		Map<Character , Integer> map = new HashMap<Character, Integer>();
		
		for(Character chr : ch) {
			if(map.containsKey(chr)) {
				map.put(chr, map.get(chr)+1);
			}else {
				map.put(chr , 1);
			}
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "==> "+entry.getValue());
		}
		
		
	}

}
