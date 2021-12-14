package Lec28;

import Lec27.MyStack;

public class DynamicStack extends MyStack{
	
	public DynamicStack()
	{
		this(5);
	}
	public DynamicStack(int cap)
	{
		super(cap);
	}
	
	public void push(int ele) throws Exception
	{
		if(isFull())
		{
			int[] narr = new int[arr.length*2];
			for(int i = 0; i < arr.length;i++)
				narr[i] = arr[i];
			
			arr = narr;
		}
		super.push(ele);
	}
	
}
