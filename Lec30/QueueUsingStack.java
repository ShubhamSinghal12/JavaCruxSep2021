package Lec30;

import Lec28.DynamicStack;

public class QueueUsingStack {

	private DynamicStack st = new DynamicStack();
	
	public boolean isEmpty()
	{
		return st.isEmpty();
	}
	
	public boolean isFull()
	{
		return st.isFull();
	}
	
	public int size()
	{
		return st.size();
	}
	
	public void enqueue(int ele) throws Exception
	{
		pushFirst(st, ele);
	}
	
	private void pushFirst(DynamicStack st, int n) throws Exception
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
	
	
	public int  dequeue() throws Exception
	{
		return st.pop();
	}
	
	public int peek() throws Exception
	{
		return st.peek();
	}
	
	public void display()
	{
		st.display();
	}

}
