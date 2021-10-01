package Lec1;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
//		int counter = 1;
//		while(counter <= n)
//		{
//			System.out.println("Hi");
//			
//			counter += 1;
//		}
		
		int i = 1;
		int sum = 0;
		while(i <= n)
		{
			sum += i;
			i++;
		}
		System.out.println(sum);
		
	}
	

}
