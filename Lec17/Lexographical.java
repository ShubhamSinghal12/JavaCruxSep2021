package Lec17;

public class Lexographical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 9; i++)
			lexo(1000,i);

	}
	
	public static void lexo(int n,int c)
	{
		if(c > n)
			return;
		else
		{
			System.out.println(c);
			for(int i = 0; i <= 9; i++)
			{
				lexo(n,c*10+i);
			}
		}
	}
	

}
