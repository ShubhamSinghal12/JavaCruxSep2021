package Lec52;

import java.util.Arrays;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "horse";
		String t = "ros";
		
		System.out.println(ed(s, t, 0, 0));
		
		int[][] dp = new int[s.length()][t.length()];
		for(int[] row:dp)
		{
			Arrays.fill(row, -1);
		}
		
		System.out.println(edTD(s, t, 0, 0, dp));
		System.out.println(edBU(s, t));
		
	}
	
	public static int ed(String s,String t,int i,int j)
	{
		
		if(t.length() == j)
		{
			return s.length()-i;
		}
		
		if(i == s.length())
		{
			return t.length()-j;
		}
		
		
		if(s.charAt(i) == t.charAt(j))
		{
			return ed(s, t, i+1, j+1);
		}
		else
		{
			int insert = ed(s, t, i, j+1) + 1;
			int delete = ed(s, t, i+1, j) + 1;
			int replace = ed(s, t, i+1, j+1) + 1;
			
			return Math.min(insert, Math.min(delete, replace));
		}
	}
	
	public static int edTD(String s,String t,int i,int j,int[][] dp)
	{
		
		if(t.length() == j)
		{
			return s.length()-i;
		}
		
		if(i == s.length())
		{
			return t.length()-j;
		}
		
		if(dp[i][j] != -1)
		{
			return dp[i][j];
		}
		
		if(s.charAt(i) == t.charAt(j))
		{
			return dp[i][j] = ed(s, t, i+1, j+1);
		}
		else
		{
			int insert = edTD(s, t, i, j+1,dp) + 1;
			int delete = edTD(s, t, i+1, j,dp) + 1;
			int replace = edTD(s, t, i+1, j+1,dp) + 1;
			
			return dp[i][j] = Math.min(insert, Math.min(delete, replace));
		}
	}
	
	
	public static int edBU(String s,String t)
	{
		int[][] dp = new int[s.length()+1][t.length()+1];
		for(int i = 0; i <= s.length(); i++)
		{
			dp[i][t.length()] = s.length()-i; 
		}
		for(int i = 0; i <= t.length(); i++)
		{
			dp[s.length()][i] = t.length()-i; 
		}
		
		for(int i = s.length()-1; i>= 0; i--)
		{
			for(int j = t.length()-1; j >= 0; j--)
			{
				if(s.charAt(i) == t.charAt(j))
				{
					dp[i][j] = dp[i+1][j+1];
				}
				else
				{
					int insert = dp[i][j+1] + 1;
					int delete = dp[i+1][j] + 1;
					int replace = dp[i+1][j+1] + 1;
					
					dp[i][j] = Math.min(insert, Math.min(delete, replace));
				}
			}
		}
		return dp[0][0];
		
	}
	
	
	
	

}
