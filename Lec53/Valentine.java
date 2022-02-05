package Lec53;

public class Valentine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = {4,5};
		int[] girls = {1,2,3,4};
		System.out.println(val(boys, girls, 0, 0));

	}
	
	
	public static int val(int[] boys,int[] girls,int i,int j)
	{
		if(i == boys.length)
		{
			return 0;
		}
		if(j == girls.length)
		{
			return 10000000;
		}
		
		return Math.min(Math.abs(boys[i]-girls[j]) + val(boys, girls, i+1, j+1), val(boys, girls, i, j+1));
	}

}
