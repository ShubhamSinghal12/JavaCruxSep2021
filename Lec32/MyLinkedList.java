package Lec32;

public class MyLinkedList {

	private class Node{
		int data;
		Node next;
		
		Node()
		{
			this(0);
		}
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
		Node(int data,Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void addFirst(int ele)
	{
		Node n = new Node(ele,head);
		head = n;
		if(tail == null)
			tail = n;
		size++;
	}
	
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public int size()
	{
//		return size;
		int s = 0;
		Node temp = head;
		while(temp != null)
		{
//			System.out.print(temp.data + " ");
			s++;
			temp = temp.next;
		}
		return s;
	}
	
	public boolean isEmpty()
	{
		return this.head == null;
	}
	
	public void addLast(int ele)
	{
		if(head == null)
		{
			addFirst(ele);
			return;
		}
		
		//For only Head
		
//		Node temp = head;
//		while(temp.next != null)
//		{
//			temp = temp.next;
//		}
//		Node n = new Node(ele);
//		temp.next = n;
		
//		Node n = new Node(ele);
//		tail.next = n;
//		tail = n;
		
		//Using GetNode
		
		Node temp = getNodeAt(size()-1);
		Node n = new Node(ele);
		temp.next = n;
		
//		size++;
	}
	
	
	public void addAt(int ele, int index) throws Exception
	{
		if(index < 0 || index >= size())
		{
			throw new Exception("Empty List");
		}
		if(index == 0)
		{
			addFirst(ele);
			return;
		}
		
		Node temp = getNodeAt(index-1);
		Node n = new Node(ele,temp.next);
		temp.next = n;
		
	}
	
	public int getFirst() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Empty List");
		}
		else
		{
			return head.data;
		}
	}
	
	public int getLast() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Empty List");
		}
		
//		Node temp = head;
//		while(temp.next != null)
//		{
//			temp = temp.next;
//		}
		
		Node temp = getNodeAt(size()-1);
		
		return temp.data;
		
	}
	
	public int getAt(int index) throws Exception
	{
		if(index < 0 || index >= size())
		{
			throw new Exception("Index out of Bound");
		}
		else
		{
			Node n = getNodeAt(index);
			return n.data;
		}
		
	}
	
	private Node getNodeAt(int index)
	{
		Node temp = head;
		while(index > 0)
		{
			temp = temp.next;
			index-- ;
		}
		return temp;
	}
	
	public int removeFirst() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Empty List");
		}
		int t = head.data;
		head = head.next;
		return t;
	}
	
	public int removeLast() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Empty List");
		}
		if(size() == 1)
		{
			return removeFirst();
		}
		Node n = getNodeAt(size()-2);
		int t = n.next.data;
		n.next = null;
		return t;
		
	}
	
	public int removeAt(int index) throws Exception
	{
		if(index < 0 || index >= size())
		{
			throw new Exception("Index out of Bound");
		}
		
		if(index == 0)
		{
			return removeFirst();
		}
		else if(index == size()-1)
		{
			return removeLast();
		}
		else
		{
			Node temp = getNodeAt(index-1);
			int t = temp.next.data;
			temp.next = temp.next.next;
			return t;
		}		
	}
	
	
	public void reverse()
	{
		Node prev = null;
		Node curr = head;
		while(curr != null)
		{
			Node ahead = curr.next;
			
			curr.next = prev;
			
			prev = curr;
			curr = ahead;
		}
		head = prev; 
	}

}
