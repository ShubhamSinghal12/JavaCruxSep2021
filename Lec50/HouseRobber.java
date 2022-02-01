package Lec50;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1,1,10};
		System.out.println(rob1(arr,0));
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(rob1TD(arr, 0, dp));
		System.out.println(rob1BU(arr));
		System.out.println(rob2(arr,arr.length-1));
		System.out.println(rob2BU(arr));

	}
	
	public static int rob1(int[] arr,int i)
	{
		if(i >= arr.length)
		{
			return 0;
		}
		else
		{
			int c1 = arr[i]+rob1(arr,i+2);
			int c2 = rob1(arr,i+1);
			
			return Math.max(c1, c2);
		}
	}
	
	public static int rob1TD(int[] arr,int i,int[] dp)
	{
		if(i >= arr.length)
		{
			return 0;
		}
		else
		{
			if(dp[i] != -1)
			{
				return dp[i];
			}
			int c1 = arr[i]+rob1TD(arr,i+2,dp);
			int c2 = rob1TD(arr,i+1,dp);
			
			
			dp[i] = Math.max(c1, c2);
			return dp[i];
		}
	}
	
	public static int rob1BU(int[] arr)
	{
		int[] dp = new int[arr.length+2];
		dp[arr.length+1] = 0;
		dp[arr.length] = 0;
		
		for(int i = arr.length-1; i >= 0; i--)
		{
			dp[i] = Math.max(arr[i]+dp[i+2], dp[i+1]);
		}
		return dp[0];
		
	}
	
	public static int rob2(int[] arr,int i)
	{
		if(i <= -1)
		{
			return 0;
		}
		else
		{
			int c1 = arr[i]+rob2(arr,i-2);
			int c2 = rob2(arr,i-1);
			
			return Math.max(c1, c2);
		}
	}
	
	public static int rob2BU(int[] arr)
	{
		int[] dp = new int[arr.length];
		
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
//		
		for(int i = 2; i < dp.length; i++)
		{
			dp[i] = Math.max(arr[i]+dp[i-2], dp[i-1]);
		}
		
		return dp[dp.length-1];
		
	}
	
	
	
	
	

}
