package Lec22;

import java.util.ArrayList;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ccc2(new int[]{2,3,6,7}, 7, new ArrayList<Integer>(),0);
		cs(new int[]{2,3,6,7}, 7, "", 0);
		
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
	
	public static void cs(int[] coins,int target,String ans,int lp)
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
			for(int i = lp;i<coins.length;i++)
			{
				cs(coins, target-coins[i], ans+coins[i], i);
			}
		}
	}

}
