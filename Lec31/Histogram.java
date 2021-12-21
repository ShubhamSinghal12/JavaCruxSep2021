package Lec31;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hist[]={6,2,5,4,5,1,6,4,3,2};
		System.out.println(maxAreaDC(hist, 0, hist.length-1));
		System.out.println(maxAreaStack(hist));

	}
	
	public static int maxAreaDC(int[] hist,int si,int ei)
	{
		if(si > ei)
		{
			return 0;
		}
		else if(si == ei)
		{
			return hist[si];
		}
		else
		{
			int mini = si;
			for(int i = si; i <= ei; i++)
			{
				if(hist[mini] > hist[i])
				{
					mini = i;
				}
			}
			
			int maxla = maxAreaDC(hist, si, mini-1);
			int maxra = maxAreaDC(hist, mini+1, ei);
			int maxa = hist[mini]*(ei-si+1);
			
			return Math.max(maxra, Math.max(maxla, maxa));
		}
	}
	
	
	public static int maxAreaStack(int[] hist)
	{
		int maxArea = 0;
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < hist.length;i++)
		{
			while(!st.isEmpty() && hist[i] <= hist[st.peek()])
			{
				int a = st.pop();
				int j = -1;
				if(!st.isEmpty())
				{
					j = st.peek();
				}
				int area = hist[a]*(i-j-1);
				if(maxArea < area)
					maxArea = area;
			}
			st.push(i);
		}
		
		int i = hist.length;
		
		while(!st.isEmpty())
		{
			int a = st.pop();
			int j = -1;
			if(!st.isEmpty())
			{
				j = st.peek();
			}
			int area = hist[a]*(i-j-1);
			if(maxArea < area)
				maxArea = area;
		}
		
		
		return maxArea;
	}

}
