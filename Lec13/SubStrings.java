package Lec13;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "nitin";
//		printAllSubStrings(st);
		System.out.println(isPalindrome2(st));
		System.out.println(countAllPalindromicSubStrings(st));

	}
	
	public static void printAllSubStrings(String st)
	{
		
		for(int i = 0; i < st.length(); i++)
		{
			for(int j = i+1; j <= st.length(); j++)
			{
				System.out.println(st.substring(i,j));
			}
		}
		
	}
	
	public static boolean isPalindrome(String st)
	{
		int si = 0;
		int ei = st.length()-1;
		
		while(si<ei)
		{
			if(st.charAt(si) != st.charAt(ei))
			{
				return false;
			}
			si++;
			ei--;
		}
		
		return true;
	}
	
	public static String reverse(String st)
	{
		String ans = "";
		
		for(int i = st.length()-1; i >= 0; i--)
		{
			ans = ans+st.charAt(i);
		}
		return ans;
	}
	
	public static boolean isPalindrome2(String st)
	{
		String rev = reverse(st);
		return rev.equals(st);
	}
	
	public static int countAllPalindromicSubStrings(String st)
	{
		int count = 0;
		for(int i = 0; i < st.length(); i++)
		{
			for(int j = i+1; j <= st.length(); j++)
			{
				String ss = st.substring(i,j);
				if(isPalindrome(ss))
				{
					count++;
					System.out.println(ss);
				}
			}
		}
		return count;
		
	}
	
	

}
