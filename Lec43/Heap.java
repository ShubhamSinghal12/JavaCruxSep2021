package Lec43;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> heap = new ArrayList<>();
	
	
	public int size()
	{
		return heap.size();
	}
	
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	
	public void add(int ele)
	{
		heap.add(ele);
		upheapify(heap.size()-1);
	}
	
	private void upheapify(int ci)
	{
		int pi = (ci-1)/2;
		if(heap.get(ci) < heap.get(pi))
		{
			swap(pi,ci);
			upheapify(pi);
		}
	}
	
	public int getMin()
	{
		return heap.get(0);
	}
	
	private void swap(int a,int b)
	{
		int t = heap.get(a);
		heap.set(a, heap.get(b));
		heap.set(b, t);
	}
	
	public void display()
	{
		System.out.println(heap);
	}
	
	public int remove()
	{
		int ans = getMin();
		swap(0,heap.size()-1);
		heap.remove(heap.size()-1);
		downheapify(0);
		return ans;
	}
	
	
	private void downheapify(int pi) {
		
		int c1 = 2*pi+1;
		int c2 = 2*pi+2;
		
		int min = pi;
		
		if(c1 < heap.size() && heap.get(min) > heap.get(c1))
		{
			min = c1;
		}
		
		if(c2 < heap.size() && heap.get(min) > heap.get(c2))
		{
			min = c2;
		}
		
		if(min != pi)
		{
			swap(pi,min);
			downheapify(min);
		}
	}

}
