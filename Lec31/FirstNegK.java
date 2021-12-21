package Lec31;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,-1,-7,8,-15,20,43,24};
		firstNeg(arr, 3);
		

	}
	
	public static void firstNeg(int[] arr,int k)
	{
		Queue<Integer> qt = new LinkedList<>();
		for(int i = 0; i < k; i++)
		{
			if(arr[i] < 0)
			{
				qt.add(i);
			}
		}
		
		if(!qt.isEmpty())
		{
			System.out.println("Window starting from "+0+" and ending at " + (k-1) +" : "+arr[qt.peek()]);
		}
		else
		{
			System.out.println("Window starting from "+0+" and ending at " + (k-1) +" : "+0);
		}
		for(int i = k; i < arr.length;i++)
		{
			if(arr[i] < 0)
			{
				qt.add(i);
			}
			if(!qt.isEmpty() && qt.peek() <= i-k)
			{
				qt.remove();
			}
			if(!qt.isEmpty())
			{
				System.out.println("Window starting from "+(i-k+1)+" and ending at " + i +" : "+arr[qt.peek()]);
			}
			else
			{
				System.out.println("Window starting from "+(i-k+1)+" and ending at " + i +" : "+0);
			}
		}
	}

}
