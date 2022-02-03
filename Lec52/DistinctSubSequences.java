package Lec52;

import java.util.Arrays;

public class DistinctSubSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbitt";
		String t = "rabbit";
		System.out.println(ds(s, t, 0, 0));
		
		int[][] dp = new int[s.length()][t.length()];
		for(int[] row:dp)
		{
			Arrays.fill(row, -1);
		}
		
		System.out.println(dsTD(s, t, 0, 0, dp));
		System.out.println(dsBU(s, t));
		

	}
	
	
	public static int ds(String s,String t,int i,int j)
	{
		if(j == t.length())
		{
			return 1;
		}
		
		if(i == s.length())
		{
			return 0;
		}
		
		
		int inc = 0;
		int exc = 0;
		if(s.charAt(i) == t.charAt(j))
		{
			inc = ds(s, t, i+1, j+1);
		}
		
		exc = ds(s, t, i+1, j);
		
		return inc+exc;
	}
	
	public static int dsTD(String s,String t,int i,int j,int[][] dp)
	{
		if(j == t.length())
		{
			return 1;
		}
		
		if(i == s.length())
		{
			return 0;
		}
		
		if(dp[i][j] != -1)
		{
			return dp[i][j];
		}
		
		int inc = 0;
		int exc = 0;
		if(s.charAt(i) == t.charAt(j))
		{
			inc = dsTD(s, t, i+1, j+1,dp);
		}
		
		exc = dsTD(s, t, i+1, j,dp);
		
		
		return dp[i][j] = inc+exc;
	}
	
	public static int dsBU(String s,String t)
	{
		int[][] dp = new int[s.length()+1][t.length()+1];
		for(int i = 0; i <= s.length(); i++)
		{
			dp[i][t.length()] = 1;
		}
		
		for(int i = s.length()-1; i>= 0; i--)
		{
			for(int j = t.length()-1; j >= 0; j--)
			{
				int inc = 0;
				int exc = 0;
				if(s.charAt(i) == t.charAt(j))
				{
					inc = dp[i+1][j+1];
				}
				exc = dp[i+1][j];
				
				dp[i][j] = inc+exc;
			}
		}
		
		
		return dp[0][0];
	}

	
	
	
	
	
	
	
}
