package Lec38;


public class BinarySearchTree {
	
private class Node{
		
		int data;
		Node left,right;
		
		public Node(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}
		
		public Node()
		{
			this(0);
		}
		
	}
	
	private Node root;
	
	public void createTree(int[] in)
	{
		root = createTree(in, 0, in.length-1);
	}
	
	private Node createTree(int[] in,int si,int ei)
	{
		if(si > ei)
		{
			return null;
		}
		else
		{
			
			int mid = (si+ei)/2;
			Node n = new Node(in[mid]);
			n.left = createTree(in, si, mid-1);
			n.right = createTree(in, mid+1, ei);
			
			return n;
		}
	}
	
	public boolean find(int ele)
	{
		return find(root,ele);
	}
	
	private boolean find(Node n,int ele)
	{
		if(n == null)
			return false;
		else
		{
			if(n.data == ele)
			{
				return true;
			}
			else if(n.data > ele)
			{
				return find(n.left, ele);
			}
			else
			{
				return find(n.right, ele);
			}
		}
	}
	
	public int min()
	{
		return min(root);
	}
	
	private int min(Node n)
	{
		if(n.left == null)
			return n.data;
		else
			return min(n.left);
	}
	
	
	
	public void add1(int ele)
	{
		if(root == null)
			root = new Node(ele);
		else
			add1(root,ele);
	}
	
	private void add1(Node n,int ele)
	{
		if(n.data > ele)
		{
			if(n.left == null)
			{
				Node nn = new Node(ele);
				n.left = nn;
			}
			else
			{
				add1(n.left,ele);
			}
		}
		else
		{
			if(n.right == null)
			{
				Node nn = new Node(ele);
				n.right = nn;
			}
			else
			{
				add1(n.right,ele);
			}
		}
	}
	
	
	public void add2(int ele)
	{
		root = add2(root, ele);
	}
	
	private Node add2(Node n,int ele)
	{
		if(n == null)
		{
			return new Node(ele);
		}
		else
		{
			if(n.data > ele)
			{
				n.left = add2(n.left,ele);
			}
			else
			{
				n.right = add2(n.right,ele);
			}
			return n;
		}
	}
	
	
	
	public void remove(int ele)
	{
		remove(root,ele);
	}
	private Node remove(Node n,int ele)
	{
		if(n == null)
			return null;
		if(n.data > ele)
		{
			n.left = remove(n.left,ele);
		}
		else if(n.data < ele)
		{
			n.right = remove(n.right,ele);
		}
		else
		{
			//0 Child
			if(n.left == null && n.right == null)
			{
				return null;
			}
			else if(n.left == null)
			{
				return n.right;
			}
			else if(n.right == null)
			{
				return n.left;
			}
			else
			{
				int r = min(n.right);
				n.data = r;
				remove(n.right,r);
			}
		}
		return n;
	}
	
	
	private Node minNode(Node n)
	{
		if(n.left == null)
			return n;
		else
			return minNode(n.left);
	}
	
	
	public void rws()
	{
		rws(root,0);
	}
	
	private int rws(Node n,int sum)
	{
		if(n == null)
			return sum;
		else
		{
			sum = rws(n.right,sum);
			
			int temp = n.data;
			n.data = sum;
			
			sum += temp;
			
			return rws(n.left,sum);
		}
	}
	public void display()
	{
		display(root);
	}
	
	private void display(Node n)
	{
		if(n == null)
		{
			return;
		}
		else
		{
			String s = "";
			if(n.left != null)
			{
				s = s + n.left.data;
			}
			s = s + " --> " + n.data +" <-- ";
			if(n.right != null)
			{
				s = s + n.right.data;
			}
			
			System.out.println(s);
			display(n.left);
			display(n.right);
		}
	}

}
