package com.cts.collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDuplicateCharacters fdc=new FindDuplicateCharacters();
		fdc.findduplicateCharecters("ppddsslllll");
	}
	public void findduplicateCharecters(String word) {
		
		Map<Character, Integer> map=new HashMap<Character, Integer> ();	
		char[] characters=word.toCharArray();	
		for (char c : characters) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}else {
				map.put(c, 1);
			}
			//System.out.println(c);
		}
		  Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }	
	}
}
