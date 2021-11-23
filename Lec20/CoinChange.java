package Lec20;

import java.util.ArrayList;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ccp(new int[]{2,3,5,7}, 10, "");
		ccc2(new int[]{2,3,5,7}, 10, new ArrayList<Integer>(),0);

	}
	
	public static void ccp(int[] coins,int target,String ans)
	{
		if(target == 0)
		{
			System.out.println(ans);
		}
		else if(target < 0)
		{
			return;
		}
		else
		{
			for(int i = 0; i < coins.length; i++)
			{
				ccp(coins,target-coins[i],ans+coins[i]+" ");
			}
		}
	}
	
	public static void ccp(int[] coins,int target,ArrayList<Integer> ans)
	{
		if(target == 0)
		{
			System.out.println(ans);
		}
		else if(target < 0)
		{
			return;
		}
		else
		{
			for(int i = 0; i < coins.length; i++)
			{
				ans.add(coins[i]);
				ccp(coins,target-coins[i],ans);
				ans.remove(ans.size()-1);
			}
		}
	}
	
	public static void ccc(int[] coins,int target,ArrayList<Integer> ans,int last)
	{
		if(target == 0)
		{
			System.out.println(ans);
		}
		else if(target < 0)
		{
			return;
		}
		else
		{
			for(int i = last; i < coins.length; i++)
			{
				ans.add(coins[i]);
				ccc(coins,target-coins[i],ans,i);
				ans.remove(ans.size()-1);
			}
		}
	}
	
	public static void ccc2(int[] coins,int target, ArrayList<Integer> ans,int place)
	{
		if(target == 0)
		{
			System.out.println(ans);
		}
		else if(target < 0 || place >= coins.length)
		{
			return;
		}
		else
		{
			ans.add(coins[place]);
			ccc2(coins, target-coins[place], ans, place);
			ans.remove(ans.size()-1);
			
			ccc2(coins, target, ans, place+1);
		}
	}
	
	
	
	
	
	
	
	
	
	

}
