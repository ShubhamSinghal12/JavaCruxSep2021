package Lec23;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,6,7,2,8,3,5};
		qs(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	 public static void qs(int[] a, int si, int ei)
	    {
	        if(si>=ei)
	        {
	            return;
	        }
	        else
	        {
	            int j=partition(a, si, ei);
	            qs(a,si,j-1);
	            qs(a,j+1,ei);
	        }
	        
	    }
	
	public static int partition(int[] arr,int si, int ei)
	{
		int pivot = arr[ei];
		int j = si;
		for(int i = si ; i < ei;i++)
		{
			if(arr[i] < pivot)
			{
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				
				j++;
			}
		}
		
		int t = arr[ei];
		arr[ei] = arr[j];
		arr[j] = t;
		
		return j;
	}
	
	

}
