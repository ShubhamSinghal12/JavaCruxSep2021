package Lec8;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,5,4};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void swap2(int arr[], int a, int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int min = i;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			swap2(arr, i, min);
		}
	}

}
