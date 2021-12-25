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
	
	public int midValue()
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
	
	
	private Node midNode()
	{
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
		
	}
	
	public static MyLinkedList merge(MyLinkedList l1, MyLinkedList l2)
	{
		MyLinkedList l3 = new MyLinkedList();
		Node i = l1.head;
		Node j = l2.head;
		
		while(i != null && j != null)
		{
			if(i.data <= j.data)
			{
				l3.addLast(i.data);
				i = i.next;
			}
			else
			{
				l3.addLast(j.data);
				j = j.next;
			}
		}
		
		while(i!=null)
		{
			l3.addLast(i.data);
			i = i.next;
		}
		while(j!=null)
		{
			l3.addLast(j.data);
			j = j.next;
		}
		
		return l3;
	}
	
	
	public void mergeSort()
	{
		MyLinkedList l = this.mergeSortHelper();
		this.head = l.head;
	}
	
	private MyLinkedList mergeSortHelper()
	{
		if(size() == 1)
		{
			MyLinkedList l = new MyLinkedList();
			l.head = this.head;
			return l;
		}
		else
		{
//			display();
			Node mid = midNode();
			MyLinkedList l1 = new MyLinkedList();
			MyLinkedList l2 = new MyLinkedList();
			
			l2.head = mid.next;
			mid.next = null;
			l1.head = this.head;
			
			MyLinkedList fh = l1.mergeSortHelper();
			MyLinkedList lh = l2.mergeSortHelper();
			
			return merge(fh, lh);
		}
		
	}
	
	
	public void dummyListForIntersection()
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		Node n10 = new Node(10);
		Node n11 = new Node(11);
		Node n12 = new Node(12);
		Node n13 = new Node(13);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		
		n11.next = n12;
		n12.next = n13;
		n13.next = n7;
		
		Node h1 = n1;
		Node h2 = n11;
		
		intersection(h1, h2);
				
	}
	
	private void intersection(Node head1, Node head2)
    {
        Node s1 = head1;
        Node s2 = head2;
        while(s1 != s2)
        {
            if(s1.next == null)
            {
                s1 = head2;
            }
            if(s2.next == null)
            {
                s2 = head1;
            }
            
            s1 = s1.next;
            s2 = s2.next;
        }
        System.out.println(s1.data + " "+ s2.data);
    }
	
	
	public void dummyListForCycle()
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		
		n8.next = n3;
		
		Node h = n1;
		this.head = h;
		CycleDetectionRemoval(h);
		
	}
	
	
	private void CycleDetectionRemoval(Node head)
	{
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
			{
				break;
			}
		}
		
		
//		Node temp = slow;
//		int count  = 1;
//		while (temp.next != slow)
//		{
//			temp = temp.next;
//			count++;
//		}
//		
//		System.out.println(count);
		
		Node s1 = slow;
		Node s2 = head;
		
//		while(count > 0)
//		{
//			s1 = s1.next;
//			count--;
//		}
//		
//		System.out.println(s1.data);
		
		while(s1.next != s2.next)
		{
			s1 = s1.next;
			s2 = s2.next;
		}
		
		System.out.println(s1.data + " "+ s2.data);
		
		s1.next = null;
		
	}
	
	
	
	
}
