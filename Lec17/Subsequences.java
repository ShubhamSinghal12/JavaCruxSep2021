package Lec17;

public class Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SS("abc","");
		System.out.println(SSC("abc",""));

	}
	
	public static void SS(String ques, String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			char ch = ques.charAt(0);
			SS(ques.substring(1),ans+ch);
			SS(ques.substring(1),ans);
		}
	}
	
	public static int SSC(String ques, String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			char ch = ques.charAt(0);
			int count = 0;
			count += SSC(ques.substring(1),ans+ch);
			count += SSC(ques.substring(1),ans);
			return count;
		}
	}
	

}
