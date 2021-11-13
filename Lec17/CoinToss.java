package Lec17;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CT(3,"");
		System.out.println(CTC(3,""));

	}
	
	public static void CT(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
		}
		else
		{
			CT(n-1,ans+'H');
			CT(n-1,ans+'T');
		}
	}
	
	public static int CTC(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int count = 0;
			if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H')
				count += CTC(n-1,ans+'H');
			
			count += CTC(n-1,ans+'T');
			return count;
		}
	}
	
	
	
	

}
