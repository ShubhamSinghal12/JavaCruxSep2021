package Lec40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class GenricsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i[] = {10,-2,30,-4,5};
//		String names[] = {"ram","hari","shyam","shubham"};
//		Character ch[] = {'1','a','A','z'};
//		
//		display(i);
//		display(names);
//		display(ch);
		
		Car cars[] = new Car[5];
		
		cars[0] = new Car(10000,100,"Red");
		cars[1] = new Car(10300,60,"Yellow");
		cars[2] = new Car(12000,60,"Blue");
		cars[3] = new Car(9000,60,"Green");
		cars[4] = new Car(15000,260,"Black");
		
		display(cars);
		
//		bubblesort(cars,new Comparator<Car>() {
//
//			@Override
//			public int compare(Car o1, Car o2) {
//				// TODO Auto-generated method stub
//				return o1.color.compareTo(o2.color);
//			}
//		});
		
//		bubblesort(cars,new SpeedPriceComp());
		
//		Arrays.sort(cars,new SpeedPriceComp());
		
		ArrayList<Car> al = new ArrayList<>(Arrays.asList(cars));
		Collections.sort(al,new SpeedPriceComp());
		
		System.out.println("--------------------------");
		System.out.println(al);
		
		
		
//		Arrays.sort(i,new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2-o1;
//			}
//		});
//		
		Arrays.sort(i,Collections.reverseOrder());
		System.out.println(Arrays.toString(i));
//		display(cars);
		
	}
	
	public static <T> void display(T[] arr)
	{
		for(T val : arr)
		{
			System.out.println(val);
		}
		System.out.println();
	}
	
	public static <T extends Comparable<T>> void bubblesort(T[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length-i-1; j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static <T> void bubblesort(T[] arr,Comparator<T> comp)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length-i-1; j++)
			{
				if(comp.compare(arr[j],arr[j+1]) > 0)
				{
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
	

}
