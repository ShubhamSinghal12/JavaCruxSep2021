package Lec41;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,1,2,35,6,53,2,4,8};
		int[] b = {1,1,2,4,6,7,8,4,3};
		System.out.println(intersection(a, b));

	}
	
	public static ArrayList<Integer> intersection(int[] a,int[] b)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < a.length; i++)
		{
			map.put(a[i],map.getOrDefault(a[i], 0)+1);
		}
		
		for(int i = 0; i < b.length; i++)
		{
			if(map.containsKey(b[i]))
			{
				int v = map.get(b[i]);
				if(v > 0)
				{
					ans.add(b[i]);
					map.put(b[i], v-1);
				}
			}
		}
		return ans;
	}

}
