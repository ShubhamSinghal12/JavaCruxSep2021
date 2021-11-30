package Lec23;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {1,4,6};
		int[] a = {2,3,5,7,8};
//		System.out.println(Arrays.toString(merge(a,b)));
		int[] c = {4,1,3,7,5,6,2};
		System.out.println(Arrays.toString(mergeSort(c, 0, c.length-1)));

	}
	
	public static int[] merge(int[] a, int[] b)
	{
		int r[] = new int[a.length+b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < a.length && j < b.length)
		{
			if(a[i] < b[j])
			{
				r[k] = a[i];
				i++;
				k++;
			}
			else
			{
				r[k] = b[j];
				j++;
				k++;
			}
		}
		
		while(j < b.length)
		{
			r[k] = b[j];
			j++;
			k++;
		}
		while(i < a.length)
		{
			r[k] = a[i];
			i++;
			k++;
		}
		return r;
		
	}

	
	public static int[] mergeSort(int[] arr,int si,int ei)
	{
		if(si == ei)
		{
			int r[] = new int[1];
			r[0] = arr[si];
			return r;
		}
		else
		{
			int mid = (si+ei)/2;
			int[] left = mergeSort(arr, si,mid);
			int[] right = mergeSort(arr,mid+1,ei);
			return merge(left,right);
		}
	}
	
}
