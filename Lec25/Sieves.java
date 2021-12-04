package Lec25;

public class Sieves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 25;
		
		boolean p[] = new boolean[n+1];
		
		for(int i = 2; i <= n; i++)
		{
			if(p[i] == false)
			{
//				System.out.println(i);
				for(int j = 2*i; j <=n; j+=i)
				{
					p[j] = true;
				}
			}
		}
		
		for(int i = 2; i <= n; i++)
		{
			if(p[i] == false)
			{
				System.out.println(i);
			}
		}

	}

}
