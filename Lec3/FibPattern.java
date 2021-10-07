package Lec3;

public class FibPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = 1;
		int nst = 1;
		int a = 0;
		int b = 1;
		while(row <= n)
		{
			//Work
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print(a+" ");
				
				int c = a+b;
				a = b;
				b = c;
				
				cst++;
			}
			
			//Update
			row++;
			System.out.println();
			nst++;
		}

	}

}
