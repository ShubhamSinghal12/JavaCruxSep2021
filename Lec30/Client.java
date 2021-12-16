package Lec30;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		QueueUsingStack qt = new QueueUsingStack();
		for(int i = 1; i <= 5; i++)
		{
			qt.enqueue(i);
			qt.display();
		}
		
		System.out.println(qt.dequeue());
		qt.display();
		
	}

}
