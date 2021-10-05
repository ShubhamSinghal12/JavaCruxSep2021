package Lec2;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = n;
		
		while(row <= n)
		{
			//Work
			
			int cst = 1;
			while(cst <= nst)
			{
//				if(row == 1 || row == n || cst == 1 || cst == nst) {
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
				if(row != 1 && row != n && cst != 1 && cst != nst) {
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
				cst++;
			}
			
			//Update
			row++;
			System.out.println();
		}

	}

}
