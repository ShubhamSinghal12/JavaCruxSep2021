package Lec25;

public class PowerLogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,6));

	}
	
	
	public static int pow(int a,int n)
	{
		if(n == 0)
			return 1;
		if(n == 1)
			return a;
		else
		{
			int half = pow(a,n/2);
			if(n%2 == 0)
			{
				return half*half;
			}
			else
			{
				return half*half*a;
			}
		}
	}

}
