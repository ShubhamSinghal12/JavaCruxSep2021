package Lec53;

import java.util.Arrays;

public class WineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = {2,4,6,2,5};
		System.out.println(wp(cost, 0, cost.length-1, 1));
		int[][] dp = new int[cost.length][cost.length];
		for(int[] row:dp)
		{
			Arrays.fill(row, -1);
		}
		System.out.println(wpTD(cost, 0, cost.length-1, 1,dp));
		System.out.println(wpBU(cost));
		
		

	}
	
	public static int wp(int[] cost,int si,int ei,int y)
	{
		if(si > ei)
		{
			return 0;
		}
		
		if(si == ei)
		{
			return y*cost[si];
		}
		
		
		int fc = cost[si]*y + wp(cost, si+1, ei, y+1);
		int sc = cost[ei]*y + wp(cost, si, ei-1, y+1);
		
		return Math.max(fc, sc);
	}
	
	public static int wpTD(int[] cost,int si,int ei,int y,int[][] dp)
	{
		if(si > ei)
		{
			return 0;
		}
		
		if(si == ei)
		{
			return y*cost[si];
		}
		
		if(dp[si][ei] != -1)
		{
			return dp[si][ei];
		}
		int fc = cost[si]*y + wpTD(cost, si+1, ei, y+1,dp);
		int sc = cost[ei]*y + wpTD(cost, si, ei-1, y+1,dp);
		
		return dp[si][ei] = Math.max(fc, sc);
	}
	
	public static int wpBU(int[] cost)
	{
		int[][] dp = new int[cost.length][cost.length];
		for(int i = 0; i < cost.length; i++)
		{
			dp[i][i] = cost.length*cost[i];
		}
		
		for(int si = cost.length-2; si >= 0; si--)
		{
			for(int ei = si+1; ei < cost.length; ei++)
			{
				int y = cost.length - (ei-si);
				int fc = cost[si]*y + dp[si+1][ei];
				int sc = cost[ei]*y + dp[si][ei-1];
				
				dp[si][ei] = Math.max(fc, sc);
			}
		}
		
		return dp[0][cost.length-1];		
	}
	
	

}
