package Lec19;

public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pp("nitin","");

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
	
	
	public static void pp(String q, String a)
	{
		if(q.length() == 0)
		{
			System.out.println(a);
		}
		else
		{
			for(int i = 0; i < q.length(); i++)
			{
				String na = q.substring(0,i+1);
				if(isPalindrome(na))
				{
					pp(q.substring(i+1),a+na+" ");
				}
			}
		}
	}

}
