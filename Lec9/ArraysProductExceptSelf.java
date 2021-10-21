package Lec9;

import java.util.Arrays;

public class ArraysProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(productExceptSelf(arr)));

	}
	
	public static int[] productExceptSelf(int[] arr) {
        
		int[] lp = new int[arr.length];
		
		int p = 1;
		for(int i = 0; i < arr.length; i++)
		{
			lp[i] = p;
			p *= arr[i];
		}
//		System.out.println(Arrays.toString(lp));
//		System.out.println(p);
		
//		int[] rp = new int[arr.length];
		p = 1;
		for(int i = arr.length-1 ; i >=0 ; i--)
		{
			lp[i] *= p;
			p *= arr[i];
		}
//		System.out.println(Arrays.toString(rp));
		
//		int[] ans = new int[arr.length];
//		for(int i = 0; i < arr.length; i++)
//		{
//			ans[i] = lp[i]*rp[i];
//		}
		
		return lp;
		
    }

}
