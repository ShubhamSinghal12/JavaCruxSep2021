package Lec43;

import java.util.Collections;
import java.util.PriorityQueue;

import Lec40.Car;
import Lec40.PriceComparator;
import Lec40.SpeedComparator;

public class GenHeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenHeap<Integer> hp = new GenHeap();
		hp.add(10);
		hp.add(30);
		hp.add(20);
		hp.add(50);
		hp.add(40);
		
		hp.display();
		System.out.println("----------------------------");
//		hp.add(15);
//		hp.display();
//		
//		System.out.println(hp.remove());
//		hp.display();
		
		
		
		
		Car cars[] = new Car[5];
		
		cars[0] = new Car(10000,100,"Red");
		cars[1] = new Car(10300,60,"Yellow");
		cars[2] = new Car(12000,60,"Blue");
		cars[3] = new Car(9000,60,"Green");
		cars[4] = new Car(15000,260,"Black");
		
		GenHeap<Car> chp = new GenHeap<>();
		
		for(Car c:cars)
			chp.add(c);
		
		chp.display();
		
		
		System.out.println("-----------------------------------");
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		pq.add(10);
//		pq.add(20);
//		pq.add(30);
//		pq.add(40);
//		pq.add(50);
//		pq.add(60);
//		
//		System.out.println(pq);
		
//		PriorityQueue<Car> pq = new PriorityQueue<Car>(new PriceComparator());
//		
//		for(Car c:cars)
//			pq.add(c);
//		System.out.println(pq);
//		
//		
//		
//		System.out.println(pq.remove());
//		
//		System.out.println(pq.poll());
		
		
		int[] arr = {20,40,10,30,50,60,35,45};
		
		for(int i:arr)
			pq.add(i);
		
		System.out.println(pq);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(pq.poll());
		}

	}

}
