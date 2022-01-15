package Lec43;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Heap hp = new Heap();
		hp.add(10);
		hp.add(30);
		hp.add(20);
		hp.add(50);
		hp.add(40);
		
		hp.display();
		hp.add(15);
		hp.display();
		
		System.out.println(hp.remove());
		hp.display();

	}

}
