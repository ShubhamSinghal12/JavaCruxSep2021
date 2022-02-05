package Lec53;

public class MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mat = {10,30,5,60};
		System.out.println(mcm(mat, 0, mat.length-1));
		
		System.out.println(mcmBU(mat));

	}
	
	public static int mcm(int[] matrix,int si,int ei)
	{
		
		if(si+1 == ei)
		{
			return 0;
		}
		
		int ans = Integer.MAX_VALUE;
		for(int k = si+1; k < ei; k++)
		{
			int fp = mcm(matrix, si, k);
			int sp = mcm(matrix, k, ei);
			int self = matrix[si] * matrix[k] * matrix[ei];
			
			ans = Math.min(ans, self+fp+sp);
		}
		return ans;
		
	}
	
	public static int mcmTD(int[] matrix,int si,int ei,int[][] dp)
	{
		
		if(si+1 == ei)
		{
			return 0;
		}
		
		if(dp[si][ei] != -1)
		{
			return dp[si][ei];
		}
		int ans = Integer.MAX_VALUE;
		for(int k = si+1; k < ei; k++)
		{
			int fp = mcmTD(matrix, si, k,dp);
			int sp = mcmTD(matrix, k, ei,dp);
			int self = matrix[si] * matrix[k] * matrix[ei];
			
			ans = Math.min(ans, self+fp+sp);
		}
		return dp[si][ei] = ans;	
	}
	
	public static int mcmBU(int[] matrix)
	{
		int[][] dp = new int[matrix.length][matrix.length];
		
		
		for(int si = matrix.length-2; si >= 0; si--)
		{
			for(int ei = si+2; ei < matrix.length; ei++)
			{
				int ans = Integer.MAX_VALUE;
				for(int k = si+1; k < ei; k++)
				{
					int fp = dp[si][k];
					int sp = dp[k][ei];
					int self = matrix[si] * matrix[k] * matrix[ei];
					
					ans = Math.min(ans, self+fp+sp);
				}
				dp[si][ei] = ans;	
			}
		}
		return dp[0][matrix.length-1];
	}
	
	
	

}
