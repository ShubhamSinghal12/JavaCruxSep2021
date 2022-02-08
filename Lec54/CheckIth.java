package Lec54;

public class CheckIth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkIth(42, 3);

	}
	
	
	public static void checkIth(int n,int i)
	{
		int mask = 1<<i-1;
		if((n&mask) == 0)
		{
			System.out.println("Not set");
		}
		else
		{
			System.out.println("Set");
		}
	}

}
