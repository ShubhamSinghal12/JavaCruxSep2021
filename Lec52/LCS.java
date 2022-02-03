package Lec52;

import java.util.Arrays;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String t = "acex";
		System.out.println(LCS(s, t, 0, 0));
		
		int[][] dp = new int[s.length()][t.length()];
		for(int[] row:dp)
		{
			Arrays.fill(row, -1);
		}
		System.out.println(LCSTD(s, t, 0, 0, dp));
		System.out.println(LCSBU(s, t));

	}
	
	public static int LCS(String s,String t,int i,int j)
	{
		
		if(i == s.length() || j == t.length())
		{
			return 0;
		}
		
		
		if(s.charAt(i) == t.charAt(j))
		{
			return 1+LCS(s, t, i+1, j+1);
		}
		else
		{
			return Math.max(LCS(s, t, i+1, j), LCS(s, t, i, j+1));
		}
	}
	
	public static int LCSTD(String s,String t,int i,int j,int[][] dp)
	{
		
		if(i == s.length() || j == t.length())
		{
			return 0;
		}
		
		if(dp[i][j] != -1)
		{
			return dp[i][j];
		}
		
		if(s.charAt(i) == t.charAt(j))
		{
			return dp[i][j] = 1+LCSTD(s, t, i+1, j+1,dp);
		}
		else
		{
			return dp[i][j] = Math.max(LCSTD(s, t, i+1, j,dp), LCSTD(s, t, i, j+1,dp));
		}
	}
	
	public static int LCSBU(String s,String t)
	{
		int[][] dp = new int[s.length()+1][t.length()+1];
		
		for(int i = s.length()-1; i>= 0; i--)
		{
			for(int j = t.length()-1; j >= 0; j--)
			{
				if(s.charAt(i) == t.charAt(j))
				{
					dp[i][j] = 1+dp[i+1][j+1];
				}
				else
				{
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		return dp[0][0];
	}
	
	
	

}
