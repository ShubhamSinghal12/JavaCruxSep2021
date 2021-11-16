package Lec17;

public class Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stairs2(5, "",1));
	}
	
	public static int stairs(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		if(n < 0)
		{
			return 0;
		}
		else
		{
			int count = 0;
			count += stairs(n-1, ans+" "+1);
			count += stairs(n-2, ans+" "+2);
			return count;
		}
	}
	
	public static int stairs2(int n,String ans,int lastStair)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		if(n < 0)
		{
			return 0;
		}
		else
		{
			int count = 0;
			if(lastStair <= 1)
				count += stairs2(n-1, ans+1+" ",1);
			count += stairs2(n-2, ans+2+" ",2);
			return count;
		}
	}
	
	

}
