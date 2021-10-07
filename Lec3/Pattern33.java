package Lec3;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int nsp = n-1;
		int nst = 1;
		int row = 1;
		int val = n;
		while(row <= n)
		{
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			
			int cst = 1;
			int cval = val;
			while(cst <= nst)
			{
				if(cst != nst/2+1) {
					System.out.print(cval+" ");
				}
				else
				{
					System.out.print("0 ");
				}
				if(cst <= nst/2)
				{
					cval++;
				}
				else
				{
					cval--;
				}
				cst++;
				
			}
			
			nsp -= 1;
			nst += 2;
			val--;
			row += 1;
			System.out.println();
		}

	}

}
