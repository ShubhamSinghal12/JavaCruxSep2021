package Lec40;

public class Demo implements Test3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test1 t = new Test1();
		Test3 d1 = new Demo();
		d1.hello();
		d1.hi();
		Test1.sayhi();
		System.out.println(Test1.r);
		
		Test2 t = new Test2(){

			@Override
			public void hello2() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous says Hello");
				
			}};
			
		t.hello2();

		
	}

	public void hello3()
	{
		System.out.println("Demo saying hello");
	}
	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}

	public void hello2() {
		// TODO Auto-generated method stub
		
	}

	

}
