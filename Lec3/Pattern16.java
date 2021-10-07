package Lec3;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = n;
		int nsp = n-1;
		
		while(row <= 2*n-1)
		{
			//Work
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			
			int cst = 1;
			while(cst<= nst)
			{
				System.out.print("* ");
				cst++;
			}
			
			//Update
			if(row < n)
			{
				nsp -= 1;
				nst -= 1;
			}
			else
			{
				nsp += 1;
				nst += 1;
			}
			row++;
			System.out.println();
		}
		

	}

}
