package Lec50;

import java.util.Arrays;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,3,1,6,2,2,7};
		
		
		int[] dp = new int[arr.length];
		int max = 0;
		Arrays.fill(dp, -1);
		for(int i = 0; i < arr.length; i++)
		{
			max = Math.max(max,LIS(arr, i,""));
		}
		System.out.println(max);
		System.out.println(LISBU(arr));
	}
	
	public static int LIS(int[] arr,int i,String ans)
	{
		if(i == arr.length)
		{
			System.out.println(ans);
			System.out.println("1234");
			return 0;
		}
		else
		{
			System.out.println(ans);
			int max = 0;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] > arr[i])
				{
					max = Math.max(max,LIS(arr,j,ans+arr[j]+" "));
				}
			}
			return max+1;
		}
		
	}
	
	public static int LISTD(int[] arr,int i,int[] dp)
	{
		
		if(dp[i] != -1)
			return dp[i];
		
		int max = 0;
		for(int j = i+1; j < arr.length; j++)
		{
			if(arr[j] > arr[i])
			{
				max = Math.max(max,LISTD(arr,j,dp));
			}
		}
		
		dp[i] = max+1;
		
		return dp[i];
	}
	
	public static int LISBU(int[] arr)
	{
		int[] dp = new int[arr.length];
		
		for(int i = arr.length-1; i >= 0; i--)
		{
			int max = 0;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] > arr[i])
				{
					max = Math.max(max,dp[j]);
				}
			}
			dp[i] = max+1;
		}
		
		int max = 0;
		for(int i = 0; i < arr.length; i++)
		{
			max = Math.max(max,dp[i]);
		}
		
		return max;
		
		
	}
	
	

}
