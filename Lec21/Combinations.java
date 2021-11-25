package Lec21;

import java.util.ArrayList;

public class Combinations {

	public static void main(String args[]) 
    {
        //System.out.println("Hello World!");
		ArrayList<ArrayList<Integer>> bigans = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
        f(4,2,0,ans,bigans);
        System.out.println(bigans);
        System.out.println(ans);
    }
    public static void f(int n, int k, int lp, ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> bigans)
    {
        if(k == 0)
        {
            System.out.println(ans);
            bigans.add(new ArrayList<Integer>(ans));
            return;
        }
        if(lp>n)
        {
            // System.out.println(ans);
            return;
        }
        else
        {
        	for(int i = lp+1; i <= n; i++)
        	{
        		ans.add(i);
        		f(n, k-1, i, ans,bigans);
        		ans.remove(ans.size()-1);
        	}

        }
    }

}
