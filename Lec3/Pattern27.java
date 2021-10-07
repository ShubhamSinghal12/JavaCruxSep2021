package Lec3;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = n-1;
		int nst = 1;
		int row = 1;
		int val = 1;
		while(row <= n)
		{
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print(val+" ");
				if(cst <= nst/2)
				{
					val++;
				}
				else
				{
					val--;
				}
				cst++;
			}
			
			nsp -= 1;
			nst += 2;
			val = 1;
			row += 1;
			System.out.println();
		}

	}

}
