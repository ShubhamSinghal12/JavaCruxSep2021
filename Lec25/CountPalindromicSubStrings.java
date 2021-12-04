package Lec25;

public class CountPalindromicSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cps("nnitinn"));

	}
	
	public static int cps(String s)
	{
		int cnt = 0;
		
		//Odd
		for(int i = 0; i < s.length(); i++)
		{
			cnt++;
			int left = i-1;
			int right = i+1;
			while(left >= 0 && right < s.length())
			{
				if(s.charAt(left) == s.charAt(right))
				{
					cnt++;
					left--;
					right++;
				}
				else
				{
					break;
				}
			}
		}
		
		for(double i = 0.5; i < s.length(); i++)
		{
			int left = (int)(i-0.5);
			int right = (int)(i+0.5);
			while(left >= 0 && right < s.length())
			{
				if(s.charAt(left) == s.charAt(right))
				{
					cnt++;
					left--;
					right++;
				}
				else
				{
					break;
				}
			}
		}

		
		return cnt;
	}

}
