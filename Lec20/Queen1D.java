package Lec20;

public class Queen1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		qc2(4,0,2,"",-1);
		qcb(new boolean[4],0,2,0,"");

	}
	
	public static void qp(boolean[] board,int qpsf, int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length; i++)
			{
				if(board[i] != true)
				{
					board[i] = true;
					qp(board,qpsf+1,tq,ans + "q" +"b"+i+" ");
					board[i] = false; // backtracking
				}
			}
		}
	}
	public static void qc(boolean[] board,int qpsf, int tq,String ans,int lastPlaced)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lastPlaced+1; i < board.length; i++)
			{
				if(board[i] != true)
				{
					board[i] = true;
					qc(board,qpsf+1,tq,ans + "q" +"b"+i+" ",i);
					board[i] = false; // backtracking
				}
			}
		}
	}
	
	public static void qc2(int board,int qpsf, int tq,String ans,int lastPlaced)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lastPlaced+1; i < board; i++)
			{
					qc2(board,qpsf+1,tq,ans + "q" +"b"+i+" ",i);
					
			}
		}
	}
	
	public static void qcb(boolean[] board,int qpsf,int tq, int place, String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else if( place >= board.length)
		{
			return;
		}
		else
		{
			board[place] = true;
			qcb(board,qpsf+1,tq,place+1,ans+"qb"+place+" ");
			board[place] = false;
			
			qcb(board,qpsf,tq,place+1,ans);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
