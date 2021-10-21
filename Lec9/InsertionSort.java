package Lec9;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,3,6,4};
//		insert(arr,5);
		insertionSort(arr);
		
	}
	
	public static void insert(int[] arr,int k)
	{
		int temp = arr[k];
		int i = k-1;
		while(i >= 0)
		{
			if(arr[i] > temp)
			{
				arr[i+1] = arr[i];
			}
			else
			{
				break;
			}
			
			i--;
		}
		
		arr[i+1] = temp;
		
//		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void insertionSort(int[] arr)
	{
		for(int i = 1; i <arr.length; i++)
		{
			insert(arr,i);
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	

}
