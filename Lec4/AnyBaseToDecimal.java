package Lec4;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 110100;
		int dn = 0;
		int multi = 1;
		int base = 2;
		while(n != 0)
		{
			int r = n%10;
			dn = dn+ multi*r;
			multi =  multi*base;
			n = n/10;
		}
		System.out.println(dn);

	}

}
