package Lec10;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stalls = {1,2,4,8,9};
		int noc = 3;
		int min = 5;
//		System.out.println(isItPossible(stalls, noc, min));
		System.out.println(aggC(stalls, noc));

	}
	public static int aggC(int[] stalls,int noc)
	{
		int ans = -1;
		int si = 1;
		int ei = stalls[stalls.length-1];
		while(si<=ei)
		{
			int mid = (si+ei)/2;
			if(isItPossible(stalls,noc,mid))
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
	
	public static boolean isItPossible(int[] stalls,int noc,int min)
	{
		int n = 1;
		int place = stalls[0];
		for(int i = 1; i < stalls.length; i++)
		{
			if(stalls[i] - place >= min)
			{
				n++;
				place = stalls[i];
			}
		}
		if(n >= noc)
			return true;
		else
			return false;
	}
	
	

}
