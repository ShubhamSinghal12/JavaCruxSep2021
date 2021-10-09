package Lec4;

public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 34;
		short s = 10;
		int i = 1000_000_000;
		long l = 1000_000_0000l;
		
		float f = 3.4f;
		double d = 3.4;
		
		b = (byte)s;
//		b = (byte)i;
//		b = (byte)l;
		
		s = b;
		
		f = l;
		
		boolean bo = true;
		
		if(bo)
		{
			System.out.println(bo);
		}
		
		
		char ch = 45;
		i = ch;
		
		ch = (char)(ch+10);
		System.out.println(ch);
		
		System.out.println(s);
		String st = "abc";
		System.out.println(10+20+"Hello"+10+20);
		System.out.println(2+'\t'+3);
		System.out.println(2+"\t"+3);
		

	}

}
