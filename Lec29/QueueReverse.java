package Lec29;

import Lec28.DynamicQueue;

public class QueueReverse {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DynamicQueue qt = new DynamicQueue();
		for(int i = 1; i <= 5; i++)
		{
			qt.enqueue(i);
		}
		qt.display();
		ar(qt);
		System.out.println();
		qt.display();

	}
	
	
	public static void ar(DynamicQueue qt) throws Exception
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
