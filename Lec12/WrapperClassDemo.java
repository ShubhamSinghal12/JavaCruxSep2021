package Lec12;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1 = 128;
		Integer a2 = a1;
		Integer a3 = Integer.valueOf(a1);
		System.out.println(a1);
		System.out.println(a2);
		
		int a4 = a2;
		int a5 = a2.intValue();
		System.out.println(a2==a3);
		
		String st = a2.toString();
		System.out.println(st);
		
		Integer a6 = Integer.parseInt(st);
		System.out.println(a6);

	}

}
