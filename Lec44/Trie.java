package Lec44;

import java.util.ArrayList;
import java.util.HashMap;

public class Trie {
	
	
	private class Node{
		char data;
		boolean isWord;
		HashMap<Character, Node> children;
		int count;
		
		Node(char data)
		{
			this.data = data;
			isWord = false;
			children = new HashMap<Character, Node>();
			count = 0;
		}		
	}
	
	Node root;
	public Trie() {
		// TODO Auto-generated constructor stub
		root = new Node('*');
	}
	
	public void insert(String word)
	{
		Node cur = root;
		cur.count++;
		for(int i = 0; i < word.length(); i++)
		{
			if(cur.children.containsKey(word.charAt(i)))
			{
				cur = cur.children.get(word.charAt(i));
			}
			else
			{
				Node r = new Node(word.charAt(i));
				cur.children.put(word.charAt(i), r);
				cur = r;
			}
			cur.count++;
		}
		cur.isWord = true;
	}
	
	public boolean search(String word)
	{
		Node cur=root;
        for(int i=0;i<word.length();i++)
        {
            if(cur.children.containsKey(word.charAt(i)))
            {
                cur=cur.children.get(word.charAt(i));
            }
	        else
	        {
	        	return false;
	        }
        }
        return cur.isWord;
	}
	
	
	public boolean startsWith(String prefix)
	{
		Node cur = root;
		
        for(int i=0;i < prefix.length();i++)
        {
            if(cur.children.containsKey(prefix.charAt(i)))
            {
                cur=cur.children.get(prefix.charAt(i));
            }
	        else
	        {
	        	return false;
	        }
        }
        return true;
	}
	
	public int countPrefix(String prefix)
	{
		Node cur = root;
		
        for(int i=0;i < prefix.length();i++)
        {
            if(cur.children.containsKey(prefix.charAt(i)))
            {
                cur=cur.children.get(prefix.charAt(i));
            }
	        else
	        {
	        	return 0;
	        }
        }
        return cur.count;
	}
	
	
	public ArrayList<String> allWordsPrefix(String prefix)
	{
		Node cur = root;
		
        for(int i=0;i < prefix.length();i++)
        {
            if(cur.children.containsKey(prefix.charAt(i)))
            {
                cur=cur.children.get(prefix.charAt(i));
            }
	        else
	        {
	        	return null;
	        }
        }
        ArrayList<String> al = new ArrayList<String>();
        allWords(cur,al,prefix);
        return al;
	}
	
	private void allWords(Node n,ArrayList<String> al,String ans)
	{
		if(n.isWord)
		{
			al.add(ans);
		}
		
		for(char c: n.children.keySet())
		{
			allWords(n.children.get(c), al, ans+c);
		}
		
	}
	
	
	

}
