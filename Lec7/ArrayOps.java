package Lec7;

import java.util.Scanner;

public class ArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = takeInput();
		display(arr);
		
//		System.out.println(search(arr,2));
//		System.out.println(maximum(arr));
		reverse(arr);
		display(arr);

	}
	
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
//		sc.close();
		return arr;
	}
	
	public static void display(int[] arr)
	{
		for(int val : arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
	public static int search(int[] arr, int a)
	{
		
		for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a){
                return i;
            }
        }
		
		return -1;
	}
	
	public static int maximum(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int val: arr)
		{
			if(val > max)
			{
				max = val;
			}
		}
		return max;
	}
	
	public static void reverse(int[] arr)
	{
		int i = 0;
		int j = arr.length-1;
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
