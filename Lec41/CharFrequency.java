package Lec41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class CharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ashfdsbgfhjsabgijsg";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		
		for(int i = 0; i < s.length(); i++)
		{
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
			
//			if(map.containsKey(s.charAt(i)))
//			{
//				map.put(s.charAt(i), map.get(s.charAt(i))+1);
//			}
//			else
//			{
//				map.put(s.charAt(i), 1);
//			}
		}
		
		ArrayList<Character> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);
		
		for(Character val:keys)
		{
			System.out.println(val+" --> "+map.get(val));
		}

	}

}
