package Lec40;


public class ClientGLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGenericLinkedList<Object> ll = new MyGenericLinkedList<>();
		
		ll.addFirst(new Car(1000,102,"Blue"));
		ll.addFirst(10);
		ll.addFirst("abc");
		
		ll.display();

	}

}
