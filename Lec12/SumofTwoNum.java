package Lec12;

import java.util.ArrayList;
import java.util.Collections;

public class SumofTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,0,2,9};
		int[] arr2 = {9,9,5,6,7};
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		
		int i = arr1.length-1;
		int j = arr2.length-1;
		
		int c = 0;
		
		while(i >=0 || j >= 0)
		{
			int sum = 0;
			if(i >= 0)
			{
				sum += arr1[i];
				i--;
			}
			
			if(j >= 0)
			{
				sum += arr2[j];
				j--;
			}
			
			sum += c;
			ans.add(sum%10);
			c = sum/10;
			System.out.println(sum+" "+c);
			
		}
		
		if(c > 0)
			ans.add(c);
		
		System.out.println(ans);
		
		Collections.reverse(ans);
		
		System.out.println(ans);

	}

}
