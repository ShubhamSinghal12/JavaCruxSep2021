package Lec30;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] st = {120,20,100,70,60,65,75,80,70,110,60};
		
		int[] ans = nextG(st);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int[] nextG(int[] arr)
	{
		
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < arr.length; i++)
		{
			//1st
			while(!st.isEmpty() && arr[i] > arr[st.peek()])
			{
				int j = st.pop();
				ans[j] = arr[i];
			}
			
			//2nd
			st.push(i);
		}
		
		while(!st.isEmpty())
		{
			int j = st.pop();
			ans[j] = -1;
		}
		
		return ans;
	}
	
	

}
