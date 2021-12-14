package Lec29;

import Lec27.MyStack;
import Lec28.DynamicStack;

public class StackQPS {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		DynamicStack st = new DynamicStack();
		for(int i = 1; i <= 5; i++)
		{
			st.push(i);
		}
		st.display();
		ar2(st);
		System.out.println();
		st.display();

	}
	
	public static void displayReverse(DynamicStack st1) throws Exception
	{
		DynamicStack st2 = new DynamicStack();
		
		while(!st1.isEmpty())
		{
			st2.push(st1.pop());
		}
		
		st2.display();
		
		while(!st2.isEmpty())
		{
			st1.push(st2.pop());
		}
	}
	
	public static void displayReverse2(DynamicStack st) throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int n = st.pop();
			displayReverse2(st);
			System.out.print(n+" ");
			st.push(n);
		}
	}
	
	
	public static void ar(DynamicStack st) throws Exception
	{
		DynamicStack s2 = new DynamicStack();
		while(!st.isEmpty())
		{
			s2.push(st.pop());
		}
		
		arHelp(st,s2);
	}
	
	public static void arHelp(DynamicStack s1,DynamicStack s2) throws Exception
	{
		if(s2.isEmpty())
		{
			return;
		}
		else
		{
			int n = s2.pop();
			arHelp(s1,s2);
			s1.push(n);
		}
	}
	
	
	public static void ar2(DynamicStack st) throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int n = st.pop();
			ar2(st);
			pushFirst(st,n);
		}
	}
	
	public static void pushFirst(DynamicStack st, int n) throws Exception
	{
		if(st.isEmpty())
		{
			st.push(n);
			return;
		}
		else
		{
			int n1 = st.pop();
			pushFirst(st,n);
			st.push(n1);
		}
	}
	
	
	
	

}
