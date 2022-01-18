package Lec44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KSortedList {
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		
		al.add(new ArrayList<Integer>(Arrays.asList(1,4,5)));
		al.add(new ArrayList<Integer>(Arrays.asList(1,3,4)));
		al.add(new ArrayList<Integer>(Arrays.asList(2,6)));
		al.add(new ArrayList<Integer>(Arrays.asList(3,4,7)));
		al.add(new ArrayList<Integer>(Arrays.asList(2,8)));
		
		System.out.println(al);
		
		System.out.println(mergeK(al));
	}
	
	
	private static class Pair{
		
		int data;
		int ind;
		int listno;
		
		public Pair(int d,int i,int l) {
			// TODO Auto-generated constructor stub
			data = d;
			ind = i;
			listno = l;
		}
	}
	
	public static ArrayList<Integer> mergeK(ArrayList<ArrayList<Integer>> al)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				return o1.data-o2.data;
			}
		});
		
		for(int i = 0; i < al.size();i++)
		{
			pq.add(new Pair(al.get(i).get(0),0,i));
		}
		
		while(!pq.isEmpty())
		{
			Pair r = pq.remove();
			ans.add(r.data);
			
			r.ind += 1;
			if(r.ind < al.get(r.listno).size()) {
				r.data = al.get(r.listno).get(r.ind);
				pq.add(r);
			}
		}
		
		return ans;
	}

}
