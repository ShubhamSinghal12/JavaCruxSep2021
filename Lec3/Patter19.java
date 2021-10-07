package Lec3;

public class Patter19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int nst = (n+1)/2;
		int nsp = -1;
		
		while(row <= n)
		{
			//Work
			int cst = 1;
			while(cst<= nst)
			{
				System.out.print("* ");
				cst++;
			}
			
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			
			cst = 1;
			if(row == 1 || row == n)
				cst = 2;
			
			while(cst<= nst)
			{
				System.out.print("* ");
				cst++;
			}
			
			//Update
			if(row <= n/2)
			{
				nsp += 2;
				nst -= 1;
			}
			else
			{
				nsp -= 2;
				nst += 1;
			}
			row++;
			System.out.println();
		}

	}

}
