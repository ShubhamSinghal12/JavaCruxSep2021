package Lec54;

public class UniqueNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,2,3,1};
		
		int val = 0;
		
		for(int i : arr)
		{
			val = val^i;
		}
		System.out.println(val);

	}

}
