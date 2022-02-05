package Lec53;

public class OptimalGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] cost = {10,100,20,2};
		System.out.println(op(cost, 0, cost.length-1));
		System.out.println(opBU(cost));
	}
	
	public static int op(int[] cost,int si,int ei)
	{
		
		if(si > ei)
		{
			return 0;
		}
		else if(si+1 == ei)
		{
			return Math.max(cost[si], cost[ei]);
		}
		else
		{
			int f = cost[si] + Math.min(op(cost, si+2, ei), op(cost, si+1, ei-1));
			int s = cost[ei] + Math.min(op(cost, si+1, ei-1), op(cost, si, ei-2));
			
			return Math.max(f, s);
		}
	}
	
	public static int opBU(int[] cost)
	{
		int[][] dp = new int[cost.length][cost.length];
		for(int i = 0; i < cost.length; i++)
		{
			dp[i][i] = cost[i];
		}
		
		for(int i = 0; i < cost.length-1; i++)
		{
			dp[i][i+1] = Math.max(cost[i], cost[i+1]);
		}
		
		for(int si = cost.length-2; si >= 0; si--)
		{
			for(int ei = si+2; ei < cost.length; ei++)
			{
				int f = cost[si] + Math.min(dp[si+2][ei], dp[si+1][ei-1]);
				int s = cost[ei] + Math.min(dp[si+1][ei-1], dp[si][ei-2]);
				
				dp[si][ei] = Math.max(f, s);
			}
		}
		return dp[0][cost.length-1];
		
	}
	
	

}
