package Lec40;

public class MyGenericLinkedList <T> {

	private class Node{
		T data;
		Node next;
		
		Node()
		{
			this(null);
		}
		Node(T data)
		{
			this.data = data;
			this.next = null;
		}
		Node(T data,Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void addFirst(T ele)
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
			System.out.print(temp.data);
			System.out.print(" ");
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
	
	public void addLast(T ele)
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
	
	
	public void addAt(T ele, int index) throws Exception
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
	
	public T getFirst() throws Exception
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
	
	public T getLast() throws Exception
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
	
	public T getAt(int index) throws Exception
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
	
	public T removeFirst() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Empty List");
		}
		T t = head.data;
		head = head.next;
		return t;
	}
	
	public T removeLast() throws Exception
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
		T t = n.next.data;
		n.next = null;
		return t;
		
	}
	
	public T removeAt(int index) throws Exception
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
			T t = temp.next.data;
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
	
	
	public void reverseR()
	{
		reverseR(null,head);
	}
	
	private void reverseR(Node prev,Node cur)
	{
		if(cur == null)
		{
			head = prev;
			return;
		}
		else
		{
			reverseR(cur, cur.next);
			cur.next = prev;
		}
	}
	
	public void reverseOR()
	{
		Node temp = head;
		reverseOR(head);
		temp.next = null;
	}
	
	private void reverseOR(Node prev)
	{
		if(prev.next == null)
		{
			head = prev;
			return;
		}
		else
		{
			reverseOR(prev.next);
			
			prev.next.next = prev;
		}
	}
	
	
	public void kreverse(int k)
	{
		head = kreverse(head, k);
	}
	
	private Node kreverse(Node h,int k)
	{
		if(h == null)
			return null;
		
		int t = k;
		Node temp = h;
		
		while(t > 0 && temp != null)
		{
			temp = temp.next;
			t--;
		}
		
		Node prev = kreverse(temp, k);
		Node curr = h;
		
		while(curr != temp)
		{
			Node ahead = curr.next;
			
			curr.next = prev;
			
			prev = curr;
			curr = ahead;
		}
		
		return prev;
		
	}
	
	public T midValue()
	{
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
		
	}
	
	
//		
	
	
	
}
