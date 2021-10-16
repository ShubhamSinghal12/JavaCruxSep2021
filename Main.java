
import java.util.*;
public class Main {

	public static int add(int m, int n)
    {
        return (m+n);
    }
    public static int sub(int m, int n)
    {
        return (m-n);
    }
    public static int prod(int m, int n)
    {
        return (m*n);
    }
    public static int div(int m, int n)
    {
        return (m/n);
    }
    public static int mod(int m, int n)
    {
        return (m/n);
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        while(c!='x'&&c!='X')
        {
            if(c=='+')
            {
                int m=sc.nextInt();
                int n= sc.nextInt();
                System.out.println(add(m,n));
            }
            else if(c=='-')
            {
                int m=sc.nextInt();
                int n= sc.nextInt();
                System.out.println(sub(m,n));
            }
            else if(c=='*')
            {
                int m=sc.nextInt();
                int n= sc.nextInt();
                System.out.println(m*n);
            }
            else if(c=='/')
            {
                int m=sc.nextInt();
                int n= sc.nextInt();
                System.out.println(div(m,n));
            }
            else if(c=='%')
            {
                int m=sc.nextInt();
                int n= sc.nextInt();
                System.out.println(mod(m,n));
            }
            else
            {
                System.out.println("Invalid operation. Try again.");
            }

            c = sc.next().charAt(0);

        }
    }
}
