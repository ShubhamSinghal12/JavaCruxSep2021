package Lec18;

public class MappedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MS("127","");
	}
	
	public static void MS(String num, String ans)
	{
		if(num.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			//Singal Digit
			char ch = num.charAt(0);
			char a = (char)(ch - '1' + 'A');
			MS(num.substring(1),ans+a);
			if(num.length() >= 2)
			{
				String d2 = num.substring(0,2);
				int nd2 = Integer.parseInt(d2);
				if(nd2 <= 26)
					MS(num.substring(2),ans + (char)('A'+nd2-1));
			}
		}
	}

}
