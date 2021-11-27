package Lec18;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tpm("aba","");
		String s = "aba";
		int[] freq = new int[26];
		for(int i = 0; i < s.length(); i++)
		{
			freq[s.charAt(i)-'a']++;
		}
		System.out.println(tpmFreq(freq, ""));
		

	}
	
	public static void pm(String ques, String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			char ch = ques.charAt(0);
			for(int i = 0; i <= ans.length(); i++)
			{
				String na = ans.substring(0,i) + ch + ans.substring(i);
				pm(ques.substring(1),na);
			}
		}
		
	}
	
	public static void pm2(String ques, String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < ques.length(); i++)
			{
				String nq = ques.substring(0,i) + ques.substring(i+1);
				pm2(nq,ans+ques.charAt(i));
			}
		}
	}
	
	public static void tpm(String ques, String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			if(ans.length() != 0)
			{
				System.out.println(ans);
			}
			for(int i = 0; i < ques.length(); i++)
			{
				boolean flag = true;
				for(int j = 0; j < i; j++)
				{
					if(ques.charAt(i) == ques.charAt(j))
					{
						flag = false;
						break;
					}
				}
				
				if(flag)
				{
					String nq = ques.substring(0,i) + ques.substring(i+1);
					tpm(nq,ans+ques.charAt(i));
				}
			}
		}
	}
	
	
	public static int tpmFreq(int[] freq,String ans)
	{
		int c = 0;
		if(ans.length() != 0)
		{
			System.out.println(ans);
			c = 1;
		}
		
		for(int i = 0; i < 26; i++) {
			if(freq[i] > 0)
			{
				freq[i]--;
				c += tpmFreq(freq, ans+(char)(i+'a'));
				freq[i]++;
				
			}
		}
		return c;
				
	}

	

}
