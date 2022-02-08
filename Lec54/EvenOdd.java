package Lec54;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		evenOdd(-10);

	}
	
	public static void evenOdd(int n)
	{
		if((n&1) == 1)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
	}
	
	

}
