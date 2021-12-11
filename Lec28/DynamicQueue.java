package Lec28;

import Lec27.MyQueue;

public class DynamicQueue extends MyQueue{

	
	@Override
	public void enqueue(int ele) throws Exception
	{
		if(isFull())
		{
			int[] narr = new int[arr.length*2];
			
			for(int i = front,j = 0; i < front+size ; i++,j++)
			{
				narr[j] = arr[i%arr.length];
			}
			arr = narr;
			front = 0;
		}
		super.enqueue(ele);
	}
	
	

}
