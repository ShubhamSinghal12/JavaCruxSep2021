package Lec11;

public class Arrays2D_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		
		
		System.out.println(arr);
		System.out.println(arr[0]);
		
		arr[1][2] = 7;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
//				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		//EFL
		for(int[] var: arr)
		{
			for(int val: var)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("---------------------");
		
		int[][] brr = new int[4][];
		System.out.println(brr[0]);
		
		brr[0] = new int[3];
		brr[1] = new int[4];
		brr[2] = new int[2];
		brr[3] = new int[5];
		
		System.out.println("--------------------");
		
		for(int i = 0; i < brr.length; i++)
		{
			for(int j = 0; j < brr[i].length; j++)
			{
				System.out.print(brr[i][j]+" ");
//				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("--------------------");
		display(brr);
		System.out.println("---------------------");
		
		
		int[][] crr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		display(crr);

	}
	
	
	public static void display(int[][] arr)
	{
		for(int[] var: arr)
		{
			for(int val: var)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
	}

}
