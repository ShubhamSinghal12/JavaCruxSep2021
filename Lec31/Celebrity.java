package Lec31;

import java.util.Stack;

public class Celebrity {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0}};
		findCeleb(matrix);

	}
	
	public static void findCeleb(int[][] arr)
	{
		Stack<Integer> st = new Stack<Integer>();
		for(int i = 0; i < arr.length; i++)
		{
			st.push(i);
		}
		
		while(st.size()>1)
		{
			int x = st.pop();
			int y = st.pop();
			if(arr[x][y] == 1)
			{
				st.push(y);
			}
			else
			{
				st.push(x);
			}
		}
		
		int c = st.pop();
		int flag = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(i != c)
			{
				if(arr[c][i] != 0 || arr[i][c] != 1) 
				{
					flag = 1;
					break;
				}
			}
		}
		if(flag == 1)
		{
			System.out.println("No celeb");
		}
		else
		{
			System.out.println("Celeb is: "+c);
		}
	}
	
	
	
	
	
	

}
