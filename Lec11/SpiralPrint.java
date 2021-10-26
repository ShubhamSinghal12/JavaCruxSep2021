package Lec11;

import java.util.Arrays;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int[] var:arr)
		{
			System.out.println(Arrays.toString(var));
		}
		System.out.println("-------------------");
		System.out.println(Arrays.deepToString(arr));
		System.out.println("-----------------");
		SpiralPrint(arr);
		
	}
	
	public static void SpiralPrint(int[][] arr)
	{
		int minrow = 0;
		int mincol = 0;
		int maxrow = arr.length-1;
		int maxcol = arr[0].length-1;
		
		int te = arr.length*arr[0].length;
		int count = 0;
		int[] brr = new int[te];
		
		while(count < te)
		{
			for(int i = mincol; i <= maxcol && count < te; i++)
			{
				brr[count] = arr[minrow][i];
				System.out.print(arr[minrow][i]+" ");
				count++;
			}
			minrow++;
			
			for(int i = minrow; i<= maxrow && count < te; i++)
			{
				brr[count] = arr[i][maxcol];
				System.out.print(arr[i][maxcol]+" ");
				count++;
			}
			maxcol--;
			
			for(int i = maxcol; i >= mincol && count < te; i--)
			{
				brr[count] = arr[maxrow][i];
				System.out.print(arr[maxrow][i]+" ");
				count++;
			}
			maxrow--;
			
			for(int i = maxrow; i >= minrow && count < te; i--)
			{
				brr[count] = arr[i][mincol];
				System.out.print(arr[i][mincol]+" ");
				count++;
			}
			mincol++;
			
		}
		System.out.println();
		System.out.println(Arrays.toString(brr));
		
	}
	

}
