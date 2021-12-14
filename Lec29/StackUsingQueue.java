package Lec29;

import Lec28.DynamicQueue;

public class StackUsingQueue {

	private DynamicQueue qt = new DynamicQueue();
	
	
	public boolean isEmpty()
	{
		return qt.isEmpty();
	}
	
	public boolean isFull()
	{
		return qt.isFull();
	}
	
	public int size()
	{
		return qt.size();
	}
	
	public void push(int ele) throws Exception
	{
		qt.enqueue(ele);
	}
	
	
	
	public int  pop() throws Exception
	{
		
		for(int i = 1; i < qt.size(); i++)
		{
			qt.enqueue(qt.dequeue());
		}
		int n = qt.dequeue();
		
		return n;
	}
	
	public int peek() throws Exception
	{
		DynamicQueue temp = new DynamicQueue();
		while(qt.size()>1)
		{
			temp.enqueue(qt.dequeue());
		}
		int n = qt.dequeue();
		qt = temp;
		qt.enqueue(n);
		return n;
	}
	
	public void display() throws Exception
	{
		ar(qt);
		qt.display();
		ar(qt);
	}
	
	private void ar(DynamicQueue qt) throws Exception
	{
		if(qt.isEmpty())
		{
			return;
		}
		else
		{
			int n = qt.dequeue();
			
			ar(qt);
			
			qt.enqueue(n);
		}
	}
	
	

}
