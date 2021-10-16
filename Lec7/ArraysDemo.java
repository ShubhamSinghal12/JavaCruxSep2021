package Lec7;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int arr[] = null;
		arr = new int[5];
		System.out.println(arr);
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println(arr.length);
		
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		
		System.out.println();
		
		
		for(int val: arr)
		{
			System.out.print(val+" ");
		}
		
		int[] brr = new int[4];
		
		brr = arr;
		
		brr[0] = 100;
		System.out.println();
		System.out.println(arr[0]);
		
		
//		System.gc();
		
		int[] crr;
		crr = new int[]{1,2,3,4};
		
		

	}

}
