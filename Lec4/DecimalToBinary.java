package Lec4;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 52;
		int bn = 0;
		int multi = 1;
		int base = 2;
		while(n != 0)
		{
			int r = n%base;
			bn = bn+ multi*r;
			multi =  multi*10;
			n = n/base;
		}
		System.out.println(bn);

	}

}
