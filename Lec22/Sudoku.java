package Lec22;

import java.util.Arrays;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
		         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
		         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
		         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
		         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
		         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
		         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
		         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
		         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
		
		sudoku(grid, 0, 0);
	}
	
	public static void sudoku(int[][] grid,int row,int col)
	{
		if(row == grid.length)
		{
			for(int[] val: grid)
			{
				System.out.println(Arrays.toString(val));
			}
			System.out.println();
			
		}
		else if(col == grid[0].length)
		{
			sudoku(grid, row+1, 0);
		}
		else
		{
			if(grid[row][col] == 0)
			{
				for(int i = 1; i <= 9; i++)
				{
					if(isItSafe(grid,row,col,i))
					{
						grid[row][col] = i;
						sudoku(grid, row, col+1);
						grid[row][col] = 0; //backtracking
					}
				}
			}
			else
			{
				sudoku(grid, row, col+1);
			}
		}
		
	}
	
	public static boolean isItSafe(int[][] grid,int row,int col,int val)
	{
		for(int i = 0; i < grid.length; i++)
		{
			if(grid[i][col] == val)
				return false;
		}
		for(int i = 0; i < grid[0].length; i++)
		{
			if(grid[row][i] == val)
			{
				return false;
			}
		}
		
		int x = row-row%3;
		int y = col-col%3;
		
		for(int i = x; i < x+3; i++)
		{
			for(int j = y; j < y+3; j++)
			{
				if(grid[i][j] == val)
					return false;
			}
		}
		
		return true;
	}
	
	
	

}
