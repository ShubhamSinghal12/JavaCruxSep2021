package Lec49;

public class DynamicProgrammingFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100000;
//		System.out.println(fibTD(n,new int[n+1]));
		System.out.println(fibBU(n));
		System.out.println(fibBUSE(n));

	}
	
	
	public static int fib(int n)
	{
		if(n == 0 || n == 1)
			return n;
		else
		{
			int sum = fib(n-1)+fib(n-2);
			return sum;
		}
	}
	
	
	public static int fibTD(int n,int[] ans)
	{
		if(n == 0 || n == 1)
			return n;
		else
		{
			//Retrieval
			if(ans[n] != 0)
				return ans[n];
			
			int sum = fibTD(n-1,ans)+fibTD(n-2,ans);
			
			//Store
			ans[n] = sum;
			
			return sum;
		}
	}
	
	public static int fibBU(int n)
	{
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i<= n; i++)
		{
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}
	
	public static int fibBUSE(int n)
	{
		int a = 0;
		int b = 1;
		for(int i = 2; i<= n; i++)
		{
			int c = a+b;
			a = b;
			b = c;
		}
		
		return b;
	}
	

}
