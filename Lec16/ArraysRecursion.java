package Lec16;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,4,6,7,4,8,2};
//		AD(arr,0);
//		AD2(arr,arr.length-1);
//		System.out.println();
//		ADR(arr,0);
		
		System.out.println();
		System.out.println(lastOc2(arr, 0, 4));
		ArrayList<Integer> al = new ArrayList<Integer>();
		display(arr, 0, 4, al);
		System.out.println(al);
		System.out.println(Arrays.toString(storeAllOc(arr, 0, 4, 0)));

	}
	
	public static void AD(int[] arr, int id)
	{
		if(id == arr.length-1)
		{
			System.out.println(arr[id]);
			return;
		}
		else
		{
			System.out.println(arr[id]);
			AD(arr,id+1);
		}
	}
	
	public static void AD2(int[] arr, int id)
	{
		if(id == 0)
		{
			System.out.println(arr[id]);
			return;
		}
		else
		{
			AD2(arr,id-1);
			System.out.println(arr[id]);
		}
	}
	
	public static void ADR(int[] arr,int id)
	{
		if(id == arr.length-1)
		{
			System.out.println(arr[id]);
			return;
		}
		else
		{
			ADR(arr,id+1);
			System.out.println(arr[id]);
		}
	}
	
	public static int search(int[] arr, int id,int ele)
	{
		if(id == arr.length)
		{
			return -1;
		}
		else
		{
			if(arr[id] == ele)
			{
				return id;
			}
			else
			{
				return search(arr, id+1, ele);
			}
		}
	}
	
	public static int lastOc(int[] arr,int id,int ele, int ans)
	{
		if(id == arr.length)
		{
			return ans;
		}
		else
		{
			if(arr[id] == ele)
			{
				ans = id;
			}
			
			return lastOc(arr, id+1, ele,ans);
		}
	}
	
	
	public static int lastOc2(int[] arr,int id,int ele)
	{
		if(id == arr.length)
		{
			return -1;
		}
		else
		{
			int ans = lastOc2(arr, id+1, ele);
			if(arr[id] == ele && ans == -1)
			{
				ans = id;
			}
			return ans;
			
		}
	}
	
	public static void display(int arr[] , int i , int ele, ArrayList<Integer> al)
    {
         
        if (i>=arr.length)
        {
            return;
        }
        else
        {
          
        if(arr[i]==ele)
        {
            // System.out.println(i);
            al.add(i);
//            System.out.println(al);

        }  
        display(arr , i+1 ,ele,al);   
        
        }
    }
	
	public static int[] storeAllOc(int[] arr,int id,int ele, int count)
	{
		if(id == arr.length)
		{
			return new int[count];
		}
		else
		{
			if(arr[id] == ele)
			{
				count++;
			}
			int[] ans = storeAllOc(arr, id+1, ele, count);
			if(arr[id] == ele)
			{
				ans[count-1] = id;
			}
			return ans;
		}
	}
	
}
