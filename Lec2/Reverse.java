package Lec2;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12321;
		int org = n;
		int temp = 0;
		while(n != 0)
		{
			int rem = n%10;
			temp = temp*10+rem;
			n = n/10;
		}
		System.out.println("Reverse: "+ temp);
		
		if(temp == org)
		{
			System.out.println("Palindrome");
		}

	}

}
