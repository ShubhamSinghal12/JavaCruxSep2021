package Lec10;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,-6,4,5,-7,4,10};
		printAllSA(arr);
		System.out.println();
		printAllSASum2(arr);
		System.out.println();
		System.out.println(maximumSASum(arr));
		System.out.println(kadanes(arr));

	}
	
	public static void printAllSA(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				for(int k = i; k <= j; k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void printAllSASum(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				int sum = 0;
				for(int k = i; k <= j; k++)
				{
					sum += arr[k];
				}
				System.out.println(sum);
			}
		}
	}
	
	public static void printAllSASum2(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
				sum += arr[j];
//				int sum = 0;
				
				System.out.println(sum);
			}
		}
	}
	
	public static int maximumSASum(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
				sum += arr[j];
//				int sum = 0;
				
//				System.out.println(sum);
				if(sum > max)
					max = sum;
			}
		}
		return max;
	}
	
	public static int kadanes(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			if(sum > max)
			{
				max = sum;
			}
			if(sum < 0)
			{
				sum = 0;
			}
		}
		
		return max;
	}

}
