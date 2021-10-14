package Lec6;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch >= 97 && ch <= 'z')
		{
			System.out.println("LowerCase");
		}
		else if(ch >= 'A' && ch <= 'Z')
		{
			System.out.println("UpperCase");
		}
		else
		{
			System.out.println("Wrong Input");
		}
		

	}

}
