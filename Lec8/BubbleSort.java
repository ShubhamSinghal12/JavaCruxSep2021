package Lec8;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,5,4};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void swap2(int arr[], int a, int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					swap2(arr, j+1, j);
				}
			}
		}
	}

}
