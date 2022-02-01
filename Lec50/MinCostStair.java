package Lec50;

import java.util.Arrays;

public class MinCostStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = {1,100,1,1,1,100,1,1,100,1};
		System.out.println(Math.min(minCost(cost, 0), minCost(cost, 1)));
		int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
		System.out.println(Math.min(minCostTD(cost, 0,dp), minCostTD(cost, 1,dp)));
        System.out.println(minCostBU(cost));

	}
	
	public static int minCost(int[] cost,int i)
	{
		if(i >= cost.length)
		{
			return 0;
		}
		else
		{
			int c = Math.min(minCost(cost, i+1), minCost(cost, i+2));
			return c+cost[i];
		}
	}
	 public static int minCostTD(int[] cost,int i,int[] dp)
	{
		if(i >= cost.length)
		{
			return 0;
		}
		else
		{
            if(dp[i] != -1)
                return dp[i];
			int c = Math.min(minCostTD(cost, i+1,dp), minCostTD(cost, i+2,dp));
			dp[i] = c+cost[i];
            return dp[i];
		}
	}
	 
	 public static int minCostBU(int[] cost)
	 {
		 int[] dp = new int[cost.length+2];
		 
		 for(int i = cost.length-1; i>= 0; i--)
		 {
			 dp[i] = Math.min(dp[i+1], dp[i+2]) + cost[i];
		 }
		 
		 return Math.min(dp[0],dp[1]);
	 }
	 
	 

}
