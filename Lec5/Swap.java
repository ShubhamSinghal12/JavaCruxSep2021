package Lec5;

public class Swap {

	static int a = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
		int b = 20;
		System.out.println(a+" "+b);
		swap(a,b);
		System.out.println(a+" "+b);
	}
	
	public static void swap(int c, int b)
	{
		int t = a;
		a = b;
		b = t;
//		System.out.println(a+" "+b);
	}

}
