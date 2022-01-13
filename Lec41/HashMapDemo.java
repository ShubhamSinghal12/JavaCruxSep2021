package Lec41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Ram", 15);
		map.put("Sohail", 28);
		map.put("Sham", 25);
		map.put("Mohan", 28);
		map.put("Aayush", 26);
		map.put(null, 10);
		
		System.out.println(map);
		
//		System.out.println(map);
		
		
		map.put("Sohail", 30);
		map.put(null, null);
		System.out.println(map);
		System.out.println("-------------------------------------");
		System.out.println(map.get("sohail"));
		System.out.println(map.containsKey("sohail"));
		
		
		System.out.println(map.remove("ram"));
		System.out.println(map);
		
		System.out.println("-------------------------------------");
		
		Set<String> keys = map.keySet();
		for(String val:keys)
		{
			System.out.println(val+" "+map.get(val));
		}
		System.out.println("-------------------------------------");
		
		ArrayList<String> al = new ArrayList<String>(map.keySet());
		System.out.println(al);
		
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
		tmap.put("Ram", 15);
		tmap.put("Sohail", 28);
		tmap.put("Sham", 25);
		tmap.put("Mohan", 28);
		tmap.put("Aayush", 26);
//		tmap.put(null, 10);
		
		System.out.println(tmap);
		
		System.out.println("-------------------------------------");
		
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<String, Integer>();
		lmap.put("Ram", 15);
		lmap.put("Sohail", 28);
		lmap.put("Sham", 25);
		lmap.put("Mohan", 28);
		lmap.put("Aayush", 26);
		lmap.put(null, 10);
		
		System.out.println(lmap);
		
		


	}

}
