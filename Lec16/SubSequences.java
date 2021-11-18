package Lec16;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subS("abc"));
		
	}
	
	public static ArrayList<String> subS(String s)
	{
		if(s.length() == 0)
		{
			return new ArrayList<String>(Arrays.asList(""));
		}
		else
		{
			char cu = s.charAt(0);
			ArrayList<String> rr = subS(s.substring(1));
			ArrayList<String> ans = new ArrayList<String>();
			for(int i = 0; i < rr.size(); i++)
			{
				ans.add(rr.get(i));
				ans.add(cu+rr.get(i));
			}
			
			return ans;
		}
	}
	
	

}
