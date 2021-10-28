package Lec12;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.size());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(null);
		System.out.println(al);
		al.add(2,100);
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		al.set(3, 300);
		System.out.println(al);
		
//		al.remove(3);
		System.out.println(al);
//		System.out.println(al.contains(300));
		

	}

}
