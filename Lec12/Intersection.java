package Lec12;

import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,1,2,3,4,4,5};
		int[] arr2= {1,1,1,3,5,6,7};
		ArrayList<Integer> al = intersect(arr1, arr2);
		System.out.println(al);
		
		
		for(int i = 0; i < al.size(); i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		
		for(Integer val: al)
		{
			System.out.print(val+" ");
		}
		
		System.out.println();
		
		
	}
	
	public static ArrayList<Integer> intersect(int[] arr1,int[] arr2)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		int i = 0;
		int j = 0;
		
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i] == arr2[j])
			{
				ans.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i] > arr2[j])
			{
				j++;
			}
			else
			{
				i++;
			}
		}
		
		return ans;
		
	}

}
