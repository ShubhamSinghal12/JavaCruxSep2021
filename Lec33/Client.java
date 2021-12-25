package Lec33;

import Lec32.MyLinkedList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyLinkedList ll = new MyLinkedList();
//		for(int i = 1; i <= 7; i++)
//		{
//			ll.addLast(i);
//			ll.display();
//		}
////		ll.reverse();
////		ll.display();
//		System.out.println();
//		ll.kreverse(3);
//		ll.display();
//		System.out.println();
//		System.out.println(ll.midValue());
		
		
//		MyLinkedList l1 = new MyLinkedList();
//		MyLinkedList l2 = new MyLinkedList();
//		
//		for(int i = 1; i <= 8; i += 2)
//		{
//			l1.addLast(i);
//			l2.addLast(i+1);
//		}
//		
//		l1.display();
//		l2.display();
//		
//		MyLinkedList l3 = MyLinkedList.merge(l1, l2);
//		l3.display();

		
//		MyLinkedList l1 = new MyLinkedList();
//		for(int i = 5; i > 0; i--)
//		{
//			l1.addLast(i);
//		}
//		
//		l1.display();
//		l1.mergeSort();
//		l1.display();
		
		
		MyLinkedList ll = new MyLinkedList();
		ll.dummyListForIntersection();
		ll.dummyListForCycle();
		ll.display();
	}
	
	

}
