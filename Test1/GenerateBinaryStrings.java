package Test1;

import java.util.Scanner;

public class GenerateBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++)
		{
			String q = sc.next();
			gBS(q,"");
			System.out.println();
		}

	}
	
	public static void gBS(String q, String a)
	{
		if(q.length() == 0)
		{
			System.out.print(a+" ");
		}
		else
		{
			if(q.charAt(0) == '?')
			{
				gBS(q.substring(1),a+'0');
				gBS(q.substring(1),a+'1');
			}
			else
				gBS(q.substring(1),a+q.charAt(0));
		}
	}

}
