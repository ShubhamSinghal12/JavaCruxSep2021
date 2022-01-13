package Lec42;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap<String, Integer> map = new MyHashMap<String, Integer>();
		map.put("Ram", 15);
		map.put("Sohail", 28);
		map.put("Sham", 25);
		map.put("Mohan", 28);
		map.put("Aayush", 26);
//		map.put(null, 10);
		
		System.out.println(map);
		
//		System.out.println(map);
		
		
		map.put("Sohail", 30);
//		map.put(null, null);
		System.out.println(map);
		System.out.println("-------------------------------------");
		System.out.println(map.get("Sohail"));
		System.out.println(map.containsKey("sohail"));
		
		
		System.out.println(map.remove("Ram"));
		System.out.println(map);

	}

}
