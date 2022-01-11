package Lec40;

public interface Test1 {
	
	
	int r = 100;
	
	void hello();
	
	default void hi() {
		
		System.out.println("hi");
	}
	
	static void sayhi()
	{
		System.out.println("Saying hi!!!");
	}

}
