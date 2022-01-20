package Lec45;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	HashMap<Integer, HashMap<Integer,Integer>> map;
	
	public Graph(int v)
	{
		map = new HashMap<>();
		for(int i = 1; i <= v; i++)
		{
			map.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int u,int v,int cost)
	{
		map.get(u).put(v, cost);
		map.get(v).put(u, cost);
	}
	
	public void addVertex(int u)
	{
		map.put(u, new HashMap<>());
	}
	
	public int noOfVertices()
	{
		return map.size();
	}
	
	public int noOfEdges()
	{
		int sum = 0;
		for(int v : map.keySet())
		{
			sum += map.get(v).size();
		}
		return sum/2;
	}
	
	public boolean containsEdge(int u,int v)
	{
		return map.get(u).containsKey(v) && map.get(v).containsKey(u);
	}
	
	public void removeEdge(int u,int v)
	{
		if(containsEdge(u, v))
		{
			map.get(u).remove(v);
			map.get(v).remove(u);
		}
	}
	
	public void removeVertex(int u)
	{
		if(map.containsKey(u))
		{
			for(int nbrs:map.get(u).keySet())
			{
				map.get(nbrs).remove(u);
			}
			
			map.remove(u);
		}
	}
	
	
	public void display()
	{
		for(int v:map.keySet())
		{
			System.out.println(v+" "+map.get(v));
		}
	}
	
	
	public boolean hasPath(int u,int v)
	{
		return hasPath(u, v,new HashSet<>());
	}
	
	public boolean hasPath(int u,int v,HashSet<Integer> visited)
	{
		if(u == v)
		{
			return true;
		}
		visited.add(u);
		for(int nbrs: map.get(u).keySet())
		{
			if(!visited.contains(nbrs))
			{
				if(hasPath(nbrs, v,visited))
					return true;
			}
		}
		return false;
	}
	
	public void printAllPath(int u,int v)
	{
		printAllPath(u, v,new HashSet<>(),"");
	}
	
	public void printAllPath(int u,int v,HashSet<Integer> visited,String ans)
	{
		if(u == v)
		{
			System.out.println(ans+" - "+u);
			return;
		}
		visited.add(u);
		for(int nbrs: map.get(u).keySet())
		{
			if(!visited.contains(nbrs))
			{
				printAllPath(nbrs, v,visited,ans+" - "+u);
			}
		}
		visited.remove(u);
		
	}
	
	public boolean hasPathBFS(int u,int v)
	{
		Queue<Integer> qt = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<Integer>();
		
		qt.add(u);
		while(!qt.isEmpty())
		{
			int r = qt.remove();
			
			if(visited.contains(r))
			{
				continue;
			}
			
			if(r == v)
			{
				return true;
			}
			
			visited.add(r);
			for(int nbrs: map.get(r).keySet())
			{
				if(!visited.contains(nbrs))
				{
					qt.add(nbrs);
				}
			}
		}
		return false;
	}
	
	public void BFST()
	{
		Queue<Integer> qt = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<Integer>();
		
		for(int v:map.keySet())
		{
			if(visited.contains(v))
			{
				continue;
			}
			else
			{
				qt.add(v);
				while(!qt.isEmpty())
				{
					int r = qt.remove();
					
					if(visited.contains(r))
					{
						continue;
					}	
					visited.add(r);
					System.out.print(r+" ");
					for(int nbrs: map.get(r).keySet())
					{
						if(!visited.contains(nbrs))
						{
							qt.add(nbrs);
						}
					}
			}
			}
		}
	}
	
	
	public void DFST()
	{
		Stack<Integer> qt = new Stack<>();
		HashSet<Integer> visited = new HashSet<Integer>();
		
		for(int v:map.keySet())
		{
			if(visited.contains(v))
			{
				continue;
			}
			else
			{
				qt.push(v);
				while(!qt.isEmpty())
				{
					int r = qt.pop();
					
					if(visited.contains(r))
					{
						continue;
					}	
					
					visited.add(r);
					System.out.print(r+" ");
					for(int nbrs: map.get(r).keySet())
					{
						if(!visited.contains(nbrs))
						{
							qt.push(nbrs);
						}
					}
			}
			}
		}
	}
	
	public boolean hasPathDFS(int u,int v)
	{
		Stack<Integer> qt = new Stack<>();
		HashSet<Integer> visited = new HashSet<Integer>();
		
		qt.push(u);
		while(!qt.isEmpty())
		{
			int r = qt.pop();
			
			if(visited.contains(r))
			{
				continue;
			}
			
			if(r == v)
			{
				return true;
			}
			
			visited.add(r);
			for(int nbrs: map.get(r).keySet())
			{
				if(!visited.contains(nbrs))
				{
					qt.push(nbrs);
				}
			}
		}
		return false;
	}
	
	public boolean isCycle()
	{
		Queue<Integer> qt = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<Integer>();
		
		for(int v: map.keySet())
		{
			if(visited.contains(v))
			{
				continue;
			}
			else
			{
				
				qt.add(v);
				while(!qt.isEmpty())
				{
					int r = qt.remove();
					
					if(visited.contains(r))
					{
						return true;
					}	
					
					visited.add(r);
					for(int nbrs: map.get(r).keySet())
					{
						if(!visited.contains(nbrs))
						{
							qt.add(nbrs);
						}
					}
				}
				
			}
		}
		return false;
	}
	
	public int noOfConnectedComponents()
	{
		Queue<Integer> qt = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<Integer>();
		
		int count  = 0;
		
		for(int v: map.keySet())
		{
			if(visited.contains(v))
			{
				continue;
			}
			else
			{
				count++;
				qt.add(v);
				while(!qt.isEmpty())
				{
					int r = qt.remove();
					
					if(visited.contains(r))
					{
						continue;
					}	
					
					visited.add(r);
					for(int nbrs: map.get(r).keySet())
					{
						if(!visited.contains(nbrs))
						{
							qt.add(nbrs);
						}
					}
				}
				
			}
		}
		return count;
	}
	
	public boolean isConnected()
	{
		return noOfConnectedComponents() == 1;
	}
	
	public ArrayList<ArrayList<Integer>> allConnectedComponents()
	{
		
		Queue<Integer> qt = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<Integer>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		
		for(int v: map.keySet())
		{
			if(visited.contains(v))
			{
				continue;
			}
			else
			{
				ArrayList<Integer> al = new ArrayList<Integer>();
				qt.add(v);
				while(!qt.isEmpty())
				{
					int r = qt.remove();
					
					if(visited.contains(r))
					{
						continue;
					}	
					
					visited.add(r);
//					System.out.print(r+" ");
					al.add(r);
					for(int nbrs: map.get(r).keySet())
					{
						if(!visited.contains(nbrs))
						{
							qt.add(nbrs);
						}
					}
				}
//				System.out.println();
				ans.add(al);	
			}
		}
		return ans;
	}
	
	
	
	

}
