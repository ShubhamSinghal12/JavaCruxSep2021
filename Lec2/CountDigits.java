package Lec2;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		int nod = 0;
		while(n != 0)
		{
			n = n/10;
			nod++;
		}
		System.out.println("Number of digits: "+ nod);

	}

}
