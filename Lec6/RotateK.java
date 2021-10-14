package Lec6;
import Lec5.ArmStrong;
public class RotateK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotate2(123456, 2));

	}
	public static int nod(int n)
	{
//		int nod = 0;
//		while(n != 0)
//		{
//			n = n/10;
//			nod++;
//		}
//		return nod;
		
		return (int)Math.log10(n)+1;	
	}
	
	public static int rotate(int n,int k)
	{
		int num = n;
		int nod = nod(n);
		
		//+1 rotation
		k = k % nod;
		if(k<0)
			k = k+nod;
		
		for(int i = 1; i <= k; i++) {
			int rem = num%10;
			num = rem*(int)Math.pow(10, nod-1) + num/10;
		}
		return num;
	}
	
	public static int rotate2(int n,int k)
	{
//		int num = n;
		int nod = ArmStrong.nod(n);
		
		//+1 rotation
		k = k % nod;
		if(k<0)
			k = k+nod;
		
		int r = n%(int)Math.pow(10, k);
		int q = n/(int)Math.pow(10, k);
		
		return r*(int)Math.pow(10, nod-k)+q;
		
	}
	
	

}
