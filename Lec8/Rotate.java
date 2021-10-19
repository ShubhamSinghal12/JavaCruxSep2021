package Lec8;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
//		rotateK(arr, -1);
		fastRotate(arr, 102);

	}
	
	public static void rotateK(int[] arr, int k)
	{
		k = k%arr.length;
		if(k < 0)
			k += arr.length;
		
		for(int j = 1; j <= k; j++)
		{
			int temp = arr[arr.length-1];
			for(int i = arr.length-2; i >= 0; i--)
			{
				arr[i+1] = arr[i];
			}
			arr[0] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void fastRotate(int[] arr, int k)
	{
		k = k%arr.length;
		if(k < 0)
			k += arr.length;
		
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void reverse(int[] arr,int i, int j)
	{
		while(i<j)
		{
			swap2(arr, i, j);
			
			i++;
			j--;
		}
	}
	public static void swap2(int arr[], int a, int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	

}
