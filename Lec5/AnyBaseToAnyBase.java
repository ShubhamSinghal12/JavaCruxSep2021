package Lec5;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(anyToany(64, 8, 2));

	}
	
	
	public static int anyToany(int n, int base1, int base2)
	{
		int dn = anyToDecimal(n, base1);
		return decimalToany(dn, base2);
	}
	
	public static int anyToDecimal(int n,int base)
	{
		int dn = 0;
		int multi = 1;
		while(n != 0)
		{
			int r = n%10;
			dn = dn + multi*r;
			multi =  multi*base;
			n = n/10;
		}
		return dn;
	}
	
	public static int decimalToany(int n, int base)
	{
		int bn = 0;
		int multi = 1;
		while(n != 0)
		{
			int r = n%base;
			bn = bn+ multi*r;
			multi =  multi*10;
			n = n/base;
		}
		return bn;
	}

}
