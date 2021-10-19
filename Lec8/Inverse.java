package Lec8;

import java.util.Arrays;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,0,2,3};
		System.out.println(Arrays.toString(inverse(arr)));

	}
	
	public static int[] inverse(int[] arr1)
	{
		int[] arr2 = new int[arr1.length];
		for(int i = 0; i <arr1.length; i++)
		{
			arr2[arr1[i]] = i;
		}
		return arr2;
	}

}
