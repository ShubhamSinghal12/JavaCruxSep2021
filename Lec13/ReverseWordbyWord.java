package Lec13;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordbyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		System.out.println(st);
		
//		String ans = "";
//		int i = st.lastIndexOf(" ");
//		while(i != -1)
//		{
//			ans = ans + st.substring(i+1) + " ";
//			st = st.substring(0,i);
//			i = st.lastIndexOf(" ");
//		}
//		
//		ans = ans + st;
//		System.out.println(ans);
		
		
		String ans[] = st.split(" ");
		System.out.println(Arrays.toString(ans));
		
		
		String rev = "";
		for(int i = ans.length-1; i>= 0; i--)
		{
			rev = rev + ans[i];
			if( i != 0)
				rev += " ";
		}
		
		System.out.println(rev);

	}

}
