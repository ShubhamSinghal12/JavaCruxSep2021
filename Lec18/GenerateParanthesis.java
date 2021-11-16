package Lec18;

public class GenerateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gp(3, "", 0, 0);

	}
	
	
	public static void gp(int n,String ans, int nop, int noc)
	{
		if(nop > n || noc > nop)
		{
//			System.out.println(ans);
			return;
		}
		else if (noc == n)
		{
			System.out.println(ans);
		}
		else
		{
			gp(n,ans+"(",nop+1,noc);
			gp(n,ans+")",nop,noc+1);
		}
		
	}

}
