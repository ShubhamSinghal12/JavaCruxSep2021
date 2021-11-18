package Lec19;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mazePath2(0, 0, 2, 2,"");

	}
	
	public static void mazePath(int cr, int cc, int er,int ec,String ans)
	{
		if(cr == er && cc == ec)
		{
			System.out.println(ans);
		}
		else if(cr > er || cc > ec)
		{
			return;
		}
		else
		{
			mazePath(cr, cc+1, er, ec, ans+"H");
			mazePath(cr+1, cc, er, ec, ans+"V");
		}
	}
	
	public static void mazePath2(int cr, int cc, int er,int ec,String ans)
	{
		if(cr == er && cc == ec)
		{
			System.out.println(ans);
		}
		else if(cr > er || cc > ec)
		{
			return;
		}
		else
		{
			mazePath2(cr, cc+1, er, ec, ans+"H");
			mazePath2(cr+1, cc, er, ec, ans+"V");
			mazePath2(cr+1, cc+1, er, ec, ans+"D");
		}
	}

}
