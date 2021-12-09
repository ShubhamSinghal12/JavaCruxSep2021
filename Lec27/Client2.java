package Lec27;

public class Client2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		MyStack st = new MyStack(5);
//		st.display();
//		st.push(1);
//		st.push(2);
//		st.push(3);
//		st.display();
//		System.out.println(st.peek());
//		System.out.println(st.pop());
//		st.display();
//		st.pop();
//		st.display();
		
//		st.push(4);
		
		MyQueue qt = new MyQueue(5);
		for(int i = 1; i <= 5; i++)
		{
			qt.enqueue(i);
			qt.display();
		}
		System.out.println(qt.dequeue());
		System.out.println(qt.dequeue());
		qt.display();
		qt.enqueue(6);
		qt.enqueue(7);
		qt.display();
		

	}

}
