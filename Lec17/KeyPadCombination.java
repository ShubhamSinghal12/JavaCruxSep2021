package Lec17;

import java.util.ArrayList;

public class KeyPadCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		keyPadC("23","",al);
		System.out.println(al);

	}
	public static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void keyPadC(String digits,String ans,ArrayList<String> al)
	{
		if(digits.length() == 0)
		{
			al.add(ans);
		}
		else
		{
			char d = digits.charAt(0);
			String st = map[d-'0'];
			
			for(int i = 0; i < st.length(); i++)
			{
				keyPadC(digits.substring(1), ans+st.charAt(i),al);
			}
			
		}
	}

}
