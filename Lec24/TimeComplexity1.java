package Lec24;


public class TimeComplexity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int n = 1000000;
		int k = 7;
		
		while(i<=n)  //TC 
		{
			i++;
		}
		
		while(i<=n) //TC 
		{
			i+=2;
//			i+=3;
		}
		
		while(i<=n) //TC
		{
			i+=k;
		}
		
		
		//-------------------------------------
		
		
		while(i<=n) //TC 
		{
			i *= 2;
		}
		
		while(i<=n) //TC 
		{
			i *= 3;
			//i *= 2;
		}
		
		while(i<=n)//TC
		{
			i *= k;
		}
		
		//-----------------------------------------
		
		while(n > 0) //TC
		{
			n /= 2;
		}
		
		while(n > 0) //TC 
		{
			n /= 3;
		}
		
		while(n > 0) //TC 
		{
			n /= k;
		}
		
		
		//-----------------------------------------
		
		while(n > 0) //
		{
			n -= 1;
		}
		
		while(n > 0) //
		{
			n -= 3;
			//n -= 2;
		}
		
		while(n > 0) //
		{
			n -= k;
		}
		
				

	}

}
