package Lec5;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(nod(12345));
//		System.out.println(isArmstrong(152));
		printArmstrong(1, 1000);

	}
	
	public static void printArmstrong(int start,int end)
	{
		for(int i = start; i <= end; i++)
		{
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}
	public static int nod(int n)
	{
//		int nod = 0;
//		while(n != 0)
//		{
//			n = n/10;
//			nod++;
//		}
//		return nod;
		
		return (int)Math.log10(n)+1;	
	}
	
	
	public static boolean isArmstrong(int n)
	{
		int nod = nod(n);
		int nn = 0;
		int temp = n;
		while(n!=0)
		{
			int rem = n%10;
			nn += (int)Math.pow(rem, nod);
			n /= 10;
		}
		if(temp == nn)
		{
			return true;
		}
		else
			return false;
		
	}

}
