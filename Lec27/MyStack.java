package Lec27;

public class MyStack {
	
	
	protected int[] arr;
	protected int top;
	
	
	public MyStack(int cap)
	{
		this.arr = new int[cap];
		this.top = 0;
	}
	
	public MyStack()
	{
		this(5); // This has to be the first stmt
	}
	
	
	public boolean isEmpty()
	{
		if(this.top == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(this.top == this.arr.length)
			return true;
		else
			return false;
	}
	
	public int size()
	{
		return top;
	}
	
	public void push(int ele) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Stack Overflow");
		}
		this.arr[top] = ele;
		this.top++;
	}
	
	public int  pop() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack underflow");
		
		this.top--;
		return this.arr[this.top];
	}
	
	public int peek() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack underflow");
		
		return this.arr[this.top-1];
	}
	
	public void display()
	{
		for(int i = top-1; i >= 0; i--)
		{
			System.out.print(this.arr[i]+" ");
		}
		System.out.println();

	}
	
	
	
	
	

}
