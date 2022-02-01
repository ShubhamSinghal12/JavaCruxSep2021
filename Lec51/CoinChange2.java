package Lec51;

import java.util.Arrays;

public class CoinChange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1,2,5};
		int amount = 5;
		System.out.println(cc(coins, 0, amount));
		
		int[][] dp = new int[coins.length][amount+1];
		for(int[] row:dp)
		{
			Arrays.fill(row, -1);
		}
		System.out.println(ccTD(coins, 0, amount,dp));
		for(int[] row:dp)
		{
//			Arrays.fill(row, -1);
			System.out.println(Arrays.toString(row));
		}
		System.out.println(ccBU(coins, amount));

	}
	
	public static int cc(int[] coins,int i,int amount)
	{
		if(amount == 0)
		{
			return 1;
		}
		if(i >= coins.length)
		{
			return 0;
		}
		
		
		int inc = 0;
		int exc = 0;
		
		if(amount >= coins[i])
		{
			inc = cc(coins, i, amount-coins[i]);
		}
		exc = cc(coins, i+1, amount);
		
		
		return inc+exc;
		
		
		
	}
	
	public static int ccTD(int[] coins,int i,int amount,int[][] dp)
	{
		if(amount == 0)
		{
			return 1;
		}
		if(i >= coins.length)
		{
			return 0;
		}
		//Retrieval
		if(dp[i][amount] != -1)
		{
			return dp[i][amount];
		}
		
		int inc = 0;
		int exc = 0;
		
		if(amount >= coins[i])
		{
			inc = ccTD(coins, i, amount-coins[i],dp);
		}
		exc = ccTD(coins, i+1, amount,dp);
		
		//Storing
		dp[i][amount] = inc+exc;
		
		return dp[i][amount];
	}
	
	public static int ccBU(int[] coins,int amount)
	{
		int[] dp = new int[amount+1];
		
		dp[0] = 1;
		
		for(int c = coins.length-1; c >= 0; c--)
		{
			for(int amt = coins[c]; amt <= amount; amt++)
			{
//				int inc = 0;
//				int exc = 0;
//				
//				inc = dp[amt-coins[c]];
//				exc = dp[amt];
				
				dp[amt] = dp[amt-coins[c]] + dp[amt];
			}
		}
		return dp[amount];
	}

}
