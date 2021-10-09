package Lec4;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minF = 0;
		int maxF = 100;
		int step = 20;
		
		int f = minF;
		while(f <= maxF)
		{
//			int c =(int) ((5/9f)*(f-32));
			int c = 5*(f-32)/9;
			System.out.println(c);
			
			f += step;
		}

	}

}
