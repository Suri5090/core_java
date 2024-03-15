//Find the word count in a string using HashMap Collection.

package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplElements {

	public static void main(String[] args) {
		
		String str = "suresh is good boy and suresh talent boy suresh talent and good boy";
		
		String[] substr = str.split(" ");
		
		
		/*Map<Character, Integer> map = new HashMap<Character, Integer>();
				
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(map.get(ch)==null || map.get(ch) == 0) {
				map.put(ch, 1);
			}
			else {
				map.put(ch, map.get(ch)+1);
			}
		}
		
		Set set = map.entrySet();
		
		Iterator<Entry<Character, Integer>> itr = set.iterator();
		
		while(itr.hasNext()) 
		{
			Entry<Character, Integer> charEntry = itr.next();
			System.out.println(charEntry.getKey()+": "+charEntry.getValue()+" times");
		}
		*/
		
		Map<String, Integer> map = new HashMap<>();

        for (String sub : substr) {

            if (map.containsKey(sub)) {
                map.put(sub, map.get(sub) + 1);
            } else {
                map.put(sub, 1);
            }
        }
		
		//System.out.println(map);
		
		Set<Entry<String, Integer>> set = map.entrySet();

        for (Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
	}
}
