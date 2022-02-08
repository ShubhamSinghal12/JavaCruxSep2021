package Lec54;

public class Unique2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,2,1,7,3,7,2,1};
		
		int a = 0;
		for(int val:arr)
		{
			a = a^val;
		}
//		System.out.println(a);
		
		int fs = a & (~(a-1));
		
		int b = 0;
		for(int val:arr)
		{
			if((val&fs) != 0)
			{
				b = b^val;
			}
		}
		
		a = a^b;
		
		System.out.println(a+ " "+ b);

	}

}
