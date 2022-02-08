package Lec54;

public class SubSequenceBitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printAll("abc");

	}
	
	public static void printAll(String st)
	{
		int x = 1<<st.length();
		for(int i = 0; i < x; i++)
		{
			printSS(st, i);
		}
	}
	
	public static void printSS(String st,int n)
	{
		String s = "";
		int i = 0;
		while(n != 0)
		{
			if((n&1) == 1)
			{
				s += st.charAt(i);
			}
			
			n = n >> 1;
			i++;
		}
		System.out.println(s);
	}

}
