package Lec51;

import java.util.Arrays;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {60,100,120};
		int[] weight = {10,20,30};
		int W = 50;
		System.out.println(knapsack(values, weight, 0, W));
		
		int[][] dp = new int[values.length][W+1];
		for(int[] row:dp)
		{
			Arrays.fill(row, -1);
		}
		System.out.println(knapsackTD(values, weight, 0, W, dp));
		System.out.println(knapsackBU(values, weight, W));
		

	}
	
	public static int knapsack(int[] values,int[] weight,int i,int W)
	{
		if(W == 0 || i >= values.length)
		{
			return 0;
		}
		
		int inc = 0;
		int exc = 0;
		
		if(W >= weight[i])
		{
			inc = values[i] + knapsack(values, weight, i+1, W-weight[i]);
		}
		
		exc = knapsack(values, weight, i+1, W);
		
		return Math.max(inc, exc);
	}

	public static int knapsackTD(int[] values,int[] weight,int i,int W,int[][] dp)
	{
		if(W == 0 || i >= values.length)
		{
			return 0;
		}
		if(dp[i][W] != -1)
		{
			return dp[i][W];
		}
		
		int inc = 0;
		int exc = 0;
		
		if(W >= weight[i])
		{
			inc = values[i] + knapsackTD(values, weight, i+1, W-weight[i],dp);
		}
		
		exc = knapsackTD(values, weight, i+1, W,dp);
		
		dp[i][W] = Math.max(inc, exc);
		
		return dp[i][W];
	}
	
	public static int knapsackBU(int[] values,int[] weight,int W)
	{
		int dp[][] = new int[values.length+1][W+1];
		
		
		for(int i = values.length-1 ; i >= 0; i--)
		{
			for(int w = 1; w <= W; w++)
			{
				int inc = 0;
				int exc = 0;
				
				if(w >= weight[i])
				{
					inc = values[i] + dp[i+1][w-weight[i]];
				}
				
				exc = dp[i+1][w];
				
				dp[i][w] = Math.max(inc, exc);
			}
		}
		
		return dp[0][W];
	}
	
	
}
