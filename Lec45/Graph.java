package Lec45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
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
	
	
	
	private class DisjointSets{
		
		private class Node{
			int data;
			int rank;
			Node parent;
			
			Node(int data,int rank)
			{
				this.data = data;
				this.rank = rank;
			}
		}
		
		HashMap<Integer,Node> ds = new HashMap<>();
		
		public void createSet(int vtx)
		{
			Node n = new Node(vtx,0);
			n.parent = n;
			ds.put(vtx, n);
		}
		
		public int find(int vtx)
		{
			Node r = find(ds.get(vtx));
			return r.data;
		}
		
		private Node find(Node n)
		{
			if(n.parent == n)
				return n;
			else
				return find(n.parent);
		}
		
		public void union(int u,int v)
		{
			Node ru = find(ds.get(u));
			Node rv = find(ds.get(v));
			
			if(ru != rv)
			{
				if(ru.rank > rv.rank)
				{
					rv.parent = ru;
				}
				else if(ru.rank < rv.rank)
				{
					ru.parent = rv;
				}
				else
				{
					rv.parent = ru;
					rv.rank++;
					
				}
			}
		}
	}
	
	private class EdgePair{
		int u;
		int v;
		int cost;
		
		EdgePair(int u,int v,int cost)
		{
			this.u = u;
			this.v = v;
			this.cost = cost;
		}
		
		@Override
		public String toString() {
			return this.u+" --> "+this.v+" @ "+this.cost;
		}
		
		
	}
	
	public ArrayList<EdgePair> allEdges()
	{
		ArrayList<EdgePair> al = new ArrayList<>();
		for(int u:map.keySet())
		{
			for(int v:map.get(u).keySet())
			{
				al.add(new EdgePair(u, v, map.get(u).get(v)));
			}
		}
		return al;
	}
	
	public void krushkal()
	{
		DisjointSets djs = new DisjointSets();
		for(int vtx : map.keySet())
		{
			djs.createSet(vtx);
		}
		ArrayList<EdgePair> edg = allEdges();
		
		Collections.sort(edg,new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		for(EdgePair edge : edg)
		{
			int ru = djs.find(edge.u);
			int rv = djs.find(edge.v);
			if(ru != rv)
			{
				System.out.println(edge);
				djs.union(edge.u, edge.v);
			}
//			else
//			{
//				System.out.println("Cycle");
//			}
		}

	}
	
	
	
	public void Prims()
	{
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<EdgePair> pq = new PriorityQueue<>(new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		pq.add(new EdgePair(1, 0, 0));
		while(!pq.isEmpty())
		{
			EdgePair ed = pq.remove();
			if(visited.contains(ed.u))
			{
				continue;
			}
			
			visited.add(ed.u);
			System.out.println(ed);
			for(int nbrs:map.get(ed.u).keySet())
			{
				if(!visited.contains(nbrs))
				{
					pq.add(new EdgePair(nbrs, ed.u, map.get(ed.u).get(nbrs)));
				}
			}
			
		}
		
		
	}
	private class DijakEdgePair{
		int vtx;
		String via;
		int cost;
		
		DijakEdgePair(int u,String v,int cost)
		{
			this.vtx = u;
			this.via = v;
			this.cost = cost;
		}
		
		@Override
		public String toString() {
			return this.vtx+" <-- "+this.via+" @ "+this.cost;
		}
		
	}
	
	public void Dijakstra()
	{
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<DijakEdgePair> pq = new PriorityQueue<>(new Comparator<DijakEdgePair>() {

			@Override
			public int compare(DijakEdgePair o1, DijakEdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		pq.add(new DijakEdgePair(1, "", 0));
		while(!pq.isEmpty())
		{
			DijakEdgePair ed = pq.remove();
			if(visited.contains(ed.vtx))
			{
				continue;
			}
			
			visited.add(ed.vtx);
			System.out.println(ed);
			for(int nbrs:map.get(ed.vtx).keySet())
			{
				if(!visited.contains(nbrs))
				{
					pq.add(new DijakEdgePair(nbrs, ed.via+ed.vtx+" ",ed.cost+map.get(ed.vtx).get(nbrs)));
				}
			}
			
		}
		
	}
	
	
	
	

}
