package Lec30;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] st = {20,100,70,60,65,75,80,70,110,60};
		
		int[] ans = stSpan(st);
		System.out.println(Arrays.toString(ans));
		
		

	}
	
	public static int[] stSpan(int[] stock)
	{
		int[] ans = new int[stock.length];
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < stock.length; i++)
		{
			//1st
			while(!st.isEmpty() && stock[i] >= stock[st.peek()])
			{
				st.pop();
			}
			
			//2nd
			if(st.isEmpty())
			{
				ans[i] = i+1;
			}
			else
			{
				ans[i] = i-st.peek();
			}
			
			//3rd
			st.push(i);
		}
		return ans;
		
	}

}
