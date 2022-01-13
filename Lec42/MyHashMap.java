package Lec42;

import java.util.ArrayList;

public class MyHashMap <K,V> {
	
	private class Node {
		
		K key;
		V value;
		Node next;
		
		Node(K key,V value)
		{
			this.key = key;
			this.value = value;
		}
		Node()
		{
			this(null,null);
		}
	}
	
	ArrayList<Node> buckets;
	private int size;
	private static final int th = 2;
	
	public MyHashMap(int bucketsize)
	{
		buckets = new ArrayList<>();
		for(int i = 0; i < bucketsize; i++)
		{
			buckets.add(null);
		}
		size = 0;
	}
	
	public MyHashMap()
	{
		this(4);
	}
	
	private int hashFn(K key)
	{
		if(key == null)
		{
			return 0;
		}
		
		int bn = key.hashCode()%buckets.size();
		
		if(bn<0)
		{
			bn += buckets.size();
		}
		
		return bn;
	}
	
	public void put(K key,V value)
	{
		int bn = hashFn(key);
		Node temp = buckets.get(bn);
		while(temp!=null)
		{
			if(temp.key.equals(key))
			{
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node n = new Node(key,value);
		n.next = buckets.get(bn);
		buckets.set(bn, n);
		
		size++;
		
		//Rehashing--Loading factor
		
		int lf = size/buckets.size();
		if(lf > th)
			rehash();
		
		
	}
	
	private void rehash()
	{
		ArrayList<Node> nb = new ArrayList<>();
		ArrayList<Node> ob = this.buckets;
		
		for(int i = 0; i < 2*ob.size();i++)
			nb.add(null);
		
		this.buckets = nb;
		this.size = 0;
		
		for(Node n:ob)
		{
			while(n != null)
			{
				this.put(n.key, n.value);
				n = n.next;
			}
		}
	}
	
	public V get(K key)
	{
		int bn = hashFn(key);
		Node temp = buckets.get(bn);
		while(temp!=null)
		{
			if(temp.key.equals(key))
			{
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public boolean containsKey(K key)
	{
		int bn = hashFn(key);
		Node temp = buckets.get(bn);
		while(temp!=null)
		{
			if(temp.key.equals(key))
			{
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	
	public V remove(K key)
	{
		int bn = hashFn(key);
		Node temp = buckets.get(bn);
		Node prev = null;
		while(temp!=null)
		{
			if(temp.key.equals(key))
			{
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null)
			return null;
		
		if(prev == null)
		{
			buckets.set(bn, temp.next);
		}
		else
		{
			prev.next = temp.next;
		}
		
		return temp.value;
	}
	
	@Override
	public String toString()
	{
		String st = "[";
		
		for(Node n:this.buckets)
		{
			while(n != null)
			{
				st = st + n.key+" : "+n.value+" ";
				n = n.next;
			}
		}
		st += "]";
		
		return st;
		
	}
	
	
	

}
