package Lec43;

import java.util.ArrayList;

public class GenHeap <T extends Comparable<T>> {
	
private ArrayList<T> heap = new ArrayList<>();
	
	
	public int size()
	{
		return heap.size();
	}
	
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	
	public void add(T ele)
	{
		heap.add(ele);
		upheapify(heap.size()-1);
	}
	
	private void upheapify(int ci)
	{
		int pi = (ci-1)/2;
		if(heap.get(ci).compareTo(heap.get(pi)) > 0)
		{
			swap(pi,ci);
			upheapify(pi);
		}
	}
	
	public T getMin()
	{
		return heap.get(0);
	}
	
	private void swap(int a,int b)
	{
		T t = heap.get(a);
		heap.set(a, heap.get(b));
		heap.set(b, t);
	}
	
	public void display()
	{
		for(T v: heap)
			System.out.println(v);
	}
	
	public T remove()
	{
		T ans = getMin();
		swap(0,heap.size()-1);
		heap.remove(heap.size()-1);
		downheapify(0);
		return ans;
	}
	
	
	private void downheapify(int pi) {
		
		int c1 = 2*pi+1;
		int c2 = 2*pi+2;
		
		int min = pi;
		
		if(c1 < heap.size() && heap.get(min).compareTo(heap.get(c1)) < 0)
		{
			min = c1;
		}
		
		if(c2 < heap.size() && heap.get(min).compareTo(heap.get(c2)) < 0)
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
