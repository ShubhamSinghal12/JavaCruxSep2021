package Lec2;

import java.util.Scanner;

public class MaxofNNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int max =sc.nextInt();
		int i = 1;
		while(i <= n-1)
		{
			int num = sc.nextInt();
			if(num > max)
				max = num;
			i++;
		}
		System.out.println("Maximum: "+max);
	}

}
