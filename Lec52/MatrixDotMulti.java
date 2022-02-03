package Lec52;

public class MatrixDotMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {2,1,-2,5}, nums2 = {3,0,-6};
		
		System.out.println(matrixmulti(nums1, nums2, 0, 0));

	}
	
	
	public static int matrixmulti(int[] a,int[] b,int i,int j)
	{
			if(i == a.length || j == b.length)
			{
				return Integer.MIN_VALUE;
			}
			
			int s = a[i]*b[j] + Math.max(matrixmulti(a, b, i+1, j+1),0);
			int f = matrixmulti(a, b, i+1, j);
			int l = matrixmulti(a, b, i, j+1);
			
			return Math.max(s, Math.max(f, l));
			
	}

}
