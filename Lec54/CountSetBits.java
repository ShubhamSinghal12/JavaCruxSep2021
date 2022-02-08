package Lec54;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(CSBO(-42));
		firstSetBit(0);

	}
	
    public static int CSB(int n)
    {
        int count = 0;
        while(n!=0)
        {
            if((n&1)!=0)
             count++;
            
             n = n>>1;
        }
        return count;
    }
    
    
    public static int CSBO(int n)
    {
    	int count = 0;
    	while(n != 0)
    	{
    		count++;
    		n = n&(n-1);
    	}
    	return count;
    }
    
    public static void firstSetBit(int n)
    {
    	int a = n & (~(n-1));
    	System.out.println(a);
    }
    
    

}
