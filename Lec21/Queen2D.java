package Lec21;

public class Queen2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		qck(new boolean[4][4],0,4,"",0,0);
		nQueens(new boolean[4][4], 0, 4, "", 0, 0);

	}
	public static void qp(boolean[][] board,int qpsf, int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length; i++)
			{
				for(int j = 0; j < board[0].length;j++)
				{
					if(board[i][j] != true)
					{
						board[i][j] = true;
						qp(board,qpsf+1,tq,ans + "q" +"b"+i+j+" ");
						board[i][j] = false; // backtracking
					}
				}
			}
		}
	}
	
	public static void qc(boolean[][] board,int qpsf,int tq, String ans, int cr,int cc)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
			return;
		}
		else if(cc == board[0].length)
		{
			qc(board, qpsf, tq, ans, cr+1, 0);
			return;
		}
		else if(cr == board.length)
		{
			return;
		}
		else
		{
			board[cr][cc] = true;
			qc(board, qpsf+1, tq, ans+"qb" +cr+cc+" ", cr, cc+1);
			board[cr][cc] = false;

			qc(board, qpsf, tq, ans, cr, cc+1);
		}
	}
	
	public static void qck(boolean[][] board,int qpsf,int tq, String ans, int cr,int cc)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
			return;
		}
		else if(cc == board[0].length)
		{
			qck(board, qpsf, tq, ans, cr+1, 0);
			return;
		}
		else if(cr == board.length)
		{
			return;
		}
		else
		{
			if(isItSafe(board,cr,cc))
			{
				board[cr][cc] = true;
				qck(board, qpsf+1, tq, ans+"qb" +cr+cc+" ", cr, cc+1);
				board[cr][cc] = false;
			}

			qck(board, qpsf, tq, ans, cr, cc+1);
		}
	}
	
	public static void nQueens(boolean[][] board,int qpsf,int tq, String ans, int cr,int cc)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
			return;
		}
		else if(cc == board[0].length)
		{
			qck(board, qpsf, tq, ans, cr+1, 0);
			return;
		}
		else if(cr == board.length)
		{
			return;
		}
		else
		{
			if(isItSafe(board,cr,cc) && cr == qpsf)
			{
				board[cr][cc] = true;
				qck(board, qpsf+1, tq, ans+"qb" +cr+cc+" ", cr+1, 0);
				board[cr][cc] = false;
			}

			qck(board, qpsf, tq, ans, cr, cc+1);
		}
	}
	
	public static boolean isItSafe(boolean[][] board, int cr,int cc)
	{
		//Row
		for(int i = 0; i < cc; i++)
		{
			if(board[cr][i])
				return false;
		}
		//Col
		for(int i = 0; i < cr; i++)
		{
			if(board[i][cc])
				return false;
		}
		//Upper left Dia
		int r = cr;
		int c = cc;
		while(r >= 0 && c >= 0)
		{
			if(board[r][c])
				return false;
			r--;
			c--;
		}
		
		//Upper Right Dia
		r = cr;
		c = cc;
		while(r >= 0 && c < board[0].length)
		{
			if(board[r][c])
				return false;
			r--;
			c++;
		}
		
		return true;
	}
	


}
