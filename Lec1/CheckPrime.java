package Lec1;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 36;
		int n = 2;
		while(n <= N)
		{
			boolean flag = true;
			int i = 2;
			int x = (int)Math.sqrt(n);
			while(i <= x)
			{
				if(n%i == 0)
				{
					flag = false;
//					System.out.println("Not Prime");
					break;
				}
				i++;
			}
			
			if(flag)
				System.out.println(n);
			
		//		System.out.println(i);
			n++;
		}

	}

}
