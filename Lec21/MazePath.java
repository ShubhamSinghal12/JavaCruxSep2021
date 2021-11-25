package Lec21;

import java.util.Arrays;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][] = new int[4][4];
		maze[1][2] = 2;
		maze[2][1] = 2;
//		maze[3][3] = 2;
		mazePath(0, 0,maze,"");

	}
	
	public static void mazePath(int cr, int cc,int[][] board,String ans)
	{
		if(cr == board.length-1 && cc == board[0].length-1 && board[cr][cc] == 0)
		{
			board[cr][cc] = 1;
			System.out.println(ans);
			displayMaze(board);
			System.out.println();
			board[cr][cc] = 0;
			
		}
		else if(cr >= board.length || cc >= board[0].length || cr < 0 || cc < 0)
		{
			return;
		}
		else
		{
			if(board[cr][cc] == 0)
			{
				board[cr][cc] = 1;
				
				int[] r = {0,0,-1,+1};
				int[] c = {-1,1,0,0};
				String a[] = {"L","R","U","D"};
				
				for(int i = 0; i < r.length; i++)
				{
					mazePath(cr+r[i], cc+c[i], board, ans+a[i]);
				}
//				mazePath(cr, cc-1, board, ans+"L");
//				mazePath(cr, cc+1, board, ans+"R");
//				mazePath(cr-1, cc, board, ans+"U");
//				mazePath(cr+1, cc, board, ans+"D");
				board[cr][cc] = 0;
			}
		}
	}
	
	
	public static void displayMaze(int[][] maze)
	{
		for(int[] val: maze)
		{
			for(int i = 0; i < val.length; i++)
			{
				if(val[i] == 1)
				{
					System.out.print(val[i]);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

}
