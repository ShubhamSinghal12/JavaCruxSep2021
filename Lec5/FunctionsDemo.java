package Lec5;

public class FunctionsDemo {

	static int g = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
//		addition();
//		subtraction();
		int a = 10;
		int b = 20;
//		additionParam(a,b);
		System.out.println(g);
		int sum = additionReturn(a, b);
		System.out.println(g);
		System.out.println(sum);
		System.out.println("Bye");
	}
	
	public static void addition()
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void subtraction()
	{
		int a = 30;
		int b = 10;
		int diff = a-b;
		System.out.println(diff);
	}
	
	
	public static void additionParam(int a,int b)
	{
		
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static int additionReturn(int a, int b)
	{
		int g;
		g = 100;
		System.out.println("In Func "+ g);
		System.out.println("In Func "+FunctionsDemo.g);
		
		int sum = a+b;
		return sum;
	}

}
