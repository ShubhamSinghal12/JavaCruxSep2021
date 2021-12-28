package Lec35;

import java.util.Scanner;

public class BinaryTree {
	
	Scanner sc = new Scanner(System.in);
	
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
	
	public void createTree()
	{
		root = createTree(null,false);
	}
	
	private Node createTree(Node parent, boolean islc)
	{
		if(parent == null)
		{
			System.out.println("Enter the data of root Node : ");
		}
		else if(islc)
		{
			System.out.println("Enter the data for left child of "+ parent.data +" : ");
		}
		else
		{
			System.out.println("Enter the data for right child of "+ parent.data +" : ");
		}
		
		int n = sc.nextInt();
		Node nn = new Node(n);
		System.out.println("Is there a left tree of "+n+" :");
		boolean ist = sc.nextBoolean();
		if(ist)
		{
			nn.left = createTree(nn,true);
		}
		
		System.out.println("Is there a right tree of "+n+" :");
		ist = sc.nextBoolean();
		if(ist)
		{
			nn.right = createTree(nn,false);
		}
		
		return nn;
		
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
	
	public int max()
	{
		return max(root);
	}
	
	private int max(Node n)
	{
		if(n == null)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			int lmax = max(n.left);
			int rmax = max(n.right);
			return Math.max(lmax, Math.max(n.data, rmax));
		}
	}
	
	public boolean search(int ele)
	{
		return search(ele,root);
	}
	
	private boolean search(int ele,Node n)
	{
		if(n == null)
		{
			return false;
		}
		else
		{
			return n.data == ele || search(ele, n.left) || search(ele,n.right);
		}
	}
	
	public int size()
	{
		return size(root);
	}
	
	private int size(Node n)
	{
		if(n == null)
		{
			return 0;
		}
		else
		{
			int lmax = size(n.left);
			int rmax = size(n.right);
			return lmax+rmax+1;
		}
	}
	
	
	public int ht()
	{
		return ht(root);
	}
	
	private int ht(Node n)
	{
		if(n == null)
		{
			return -1;
		}
		else
		{
			int l = ht(n.left);
			int r = ht(n.right);
			return Math.max(l, r) + 1;
		}
	}
	public void preorder()
	{
		preorder(root);
	}
	
	private void preorder(Node n)
	{
		if(n == null)
		{
			return;
		}
		else
		{
			System.out.print(n.data +" ");			
			
			preorder(n.left);
			
			preorder(n.right);
		}
	}
	
	public void inorder()
	{
		inorder(root);
	}
	
	private void inorder(Node n)
	{
		if(n == null)
		{
			return;
		}
		else
		{			
			
			inorder(n.left);
			
			System.out.print(n.data +" ");
			
			inorder(n.right);
		}
	}
	
	public void postorder()
	{
		postorder(root);
	}
	
	private void postorder(Node n)
	{
		if(n == null)
		{
			return;
		}
		else
		{			
			
			postorder(n.left);
			
			postorder(n.right);
			
			System.out.print(n.data +" ");
		}
	}

}
