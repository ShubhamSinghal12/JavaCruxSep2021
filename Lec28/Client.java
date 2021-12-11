package Lec28;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------------Case 1 --------------");
		Parent obj1 = new Parent();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
//		System.out.println(obj1.d2);
		
		obj1.fun();
		obj1.fun1();
//		obj1.fun2();
		
		System.out.println("----------------Case 2 --------------");
		Parent obj2 = new Child();
		System.out.println(((Child)obj2).d);
		System.out.println(obj2.d1);
		System.out.println(((Child)obj2).d2);
		
		obj2.fun();
		obj2.fun1();
		((Child)obj2).fun2();
		
//		System.out.println("----------------Case 3 --------------");
//		Child obj3 = new Parent();
//		
//		System.out.println((obj3).d);
//		System.out.println(obj3.d1);
//		System.out.println((obj3).d2);
//		
//		obj3.fun();
//		obj3.fun1();
//		(obj3).fun2();
		
		System.out.println("----------------Case 4 --------------");
		Child obj4 = new Child();
		
		System.out.println(((Parent)obj4).d);
		System.out.println(obj4.d1);
		System.out.println((obj4).d2);
		
		obj4.fun();
		obj4.fun1();
		(obj4).fun2();
		
		
		
		
		
		
		

	}

}
