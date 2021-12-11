package Lec27;

public class MyQueue {
	
	protected int[] arr;
	protected int front;
	protected int size;
	
	public MyQueue(int cap)
	{
		arr = new int[cap];
		front = size = 0;
	}
	public MyQueue()
	{
		this(5);
	}
	
	public boolean isEmpty()
	{
		if(size == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(this.size == this.arr.length)
			return true;
		else
			return false;
	}
	
	public int size()
	{
		return size;
	}
	
	public void enqueue(int ele) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Queue Overflow");
		}
		arr[(front+size)%arr.length] = ele;
		size++;
	}
	
	public int  dequeue() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack underflow");
		
		int r = arr[front];
		front = (front+1)%arr.length;
		size--;
		return r;
	}
	
	public int peek() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack underflow");
		
		return this.arr[front];
	}
	
	public void display()
	{
		for(int i = front; i < front+size; i++)
		{
			System.out.print(this.arr[i%arr.length]+" ");
		}
		System.out.println();

	}
	

}
