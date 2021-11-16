package Lec18;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tpm("aba","");

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
	
	
	

}
