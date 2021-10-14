package Lec6;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(inverse(32145));

	}
	
	public static int inverse(int n)
	{
		int place = 1;
		int inv = 0;
		while(n!=0)
		{
			int rem = n%10;
			inv += place*Math.pow(10, rem-1);
			
			n/=10;
			place++;
		}
		
		return inv;
	}

}
