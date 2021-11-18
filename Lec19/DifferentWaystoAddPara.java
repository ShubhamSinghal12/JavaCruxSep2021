package Lec19;

import java.util.ArrayList;

public class DifferentWaystoAddPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(diff("2*3-4*5"));

	}
	
	public static int operation(int a, int b, char op)
	{
		if(op == '+')
			return a+b;
		else if(op == '-')
			return a-b;
		else
			return a*b;
	}
	
	public static boolean isOperator(char op)
	{
		return op == '+' || op == '-' || op == '*';
	}
	
	public static ArrayList<Integer> diff(String s)
	{
		if(s.indexOf('+') == -1 && s.indexOf('-') == -1 && s.indexOf('*') == -1)
		{
			ArrayList<Integer> ans = new ArrayList<Integer>();
			ans.add(Integer.parseInt(s));
			return ans;
		}
		else
		{
			ArrayList<Integer> ans = new ArrayList<Integer>();
			for(int i = 0;i <s.length();i++)
			{
				if(isOperator(s.charAt(i)))
				{
					ArrayList<Integer> left = diff(s.substring(0,i));
					ArrayList<Integer> right = diff(s.substring(i+1));
					
					for(int j = 0; j < left.size(); j++)
					{
						for(int k = 0; k < right.size(); k++)
						{
							ans.add(operation(left.get(j),right.get(k),s.charAt(i)));
						}
					}
				}
			}
			return ans;
		}
	}

}
