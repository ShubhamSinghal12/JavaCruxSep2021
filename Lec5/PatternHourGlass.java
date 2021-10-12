package Lec5;

public class PatternHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int row = 1;
		int nst = 2*n+1;
		int csi = 2;
		int csj = 2*n;
		
		while(row <= 2*n+1)
		{
			int cst = 1;
			int val = n;
			while(cst <= nst)
			{
				if(cst >= csi && cst <= csj)
					System.out.print("  ");
				else
					System.out.print(val+" ");
				
				if(cst <= nst/2)
				{
					val--;
				}
				else
				{
					val++;
				}
				
				cst++;
			}
			
			
			if(row <= n)
			{
				csi++;
				csj--;
			}
			else
			{
				csi--;
				csj++;
			}
			
			row++;
			System.out.println();
		}

	}

}
