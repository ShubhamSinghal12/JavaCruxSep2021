package Lec13;

public class StringTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		
		long startTime = System.currentTimeMillis();
		for(int i = 1; i < 100000; i++)
		{
			s = s+"a";
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);

	}

}
