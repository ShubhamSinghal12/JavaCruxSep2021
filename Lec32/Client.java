package Lec32;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MyLinkedList ll = new MyLinkedList();
		for(int i = 1; i <= 5; i ++)
		{
			ll.addLast(i);
			ll.display();
		}
		
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.getAt(2));
//		
//		ll.addAt(10, 1);
//		ll.display();
//		
//		ll.removeFirst();
//		ll.display();
//		ll.removeLast();
//		ll.display();
//		
//		ll.removeAt(1);
//		ll.display();
		
		ll.reverse();
		ll.display();
		System.out.println(ll.size());

	}

}
