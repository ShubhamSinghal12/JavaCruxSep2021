package Lec10;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(100));

	}
	
	public static int sqrt(int n)
	{
		int ans = -1;
		int si = 0;
		int ei = n;
		while(si<=ei)
		{
			int mid = (si+ei)/2;
			if(isItPossible(n,mid))
			{
				ans = mid;
				si = mid+1;
			}
			else
			{
				ei = mid-1;
			}
		}
		
		return ans;
		
	}
	public static boolean isItPossible(int n,int mid)
	{
		return mid*mid <= n;
	}

}
