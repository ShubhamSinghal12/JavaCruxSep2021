package Lec15;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(sumN(5));
//		PI2(1,5);
//		System.out.println(fib(8));
		System.out.println(powTail(2,5,1));
		System.out.println(fibTail(0, 1, 6));

	}
	
	public static int sumN(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return n + sumN(n-1);
		}
	}
	
	public static void PD(int n)
	{
		if(n <= 0)
		{
			return;
		}
		else
		{
			System.out.println(n);
			PD(n-1);
		}
	}
	
	public static void PDI(int n)
	{
		if(n == 1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(n);
			PDI(n);
			System.out.println(n);
		}
	}
	
	public static void PI(int n)
	{
		if(n <= 0)
		{
			return;
		}
		else
		{
			PI(n-1);
			System.out.println(n);
		}
	}
	
	public static void PI2(int n1,int n2)
	{
		if(n1 > n2)
		{
			return;
		}
		else
		{
			System.out.println(n1);
			PI2(n1+1,n2);
		}
	}
	
	public static int pow(int x, int y)
    {
        if(y==0)
        {
        	return 1;
        }
        else {
        	return x*pow(x,y-1);
        }
    }
	

	public static int powTail(int x, int y,int ans)
    {
        if(y==0)
        {
        	return ans;
        }
        else {
        	
        	ans = ans*x;
        	return powTail(x,y-1,ans);
        }
    }
	
    public static int fac(int n)
    {
        if(n==0)
        {
        	return 1;
        }
        else
        {
        	return n*fac(n-1);
        }
    }
    
    
    public static int facTail(int n,int ans)
    {
        if(n==0)
        {
        	return ans;
        }
        else
        {
        	ans = ans*n;
        	return facTail(n-1,ans);
        }
    }
    
    public static int fibTail(int a, int b, int n)
    {
    	if( n == 0)
    	{
    		return a;
    	}
    	else
    	{
    		return fibTail(b,a+b,n-1);
    	}
    	
    }
    
    
	
	
	

}
