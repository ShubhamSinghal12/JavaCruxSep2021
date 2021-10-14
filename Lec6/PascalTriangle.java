package Lec6;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pt(5);

	}
	
	public static void pt(int N) {
		
		for(int n = 0; n < N; n++)
		{
			int ncr = 1;
			System.out.print(ncr+"\t");
			for(int r = 1; r <= n; r++)
			{
				ncr = (n-r+1)*ncr/r;
				System.out.print(ncr+"\t");
			}
			System.out.println();
		}
		
	}
	

}
