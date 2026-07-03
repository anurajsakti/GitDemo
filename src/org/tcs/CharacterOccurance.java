package org.tcs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		
		String s = "Welcome to java";
		Map<Character,Integer>mp = new LinkedHashMap<Character,Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
		if(mp.containsKey(c)) {
			Integer x = mp.get(c);
			mp.put(c, x+1);
		}else {
			mp.put(c, 1);
		}
		}
		System.out.println(mp);
	}
}
