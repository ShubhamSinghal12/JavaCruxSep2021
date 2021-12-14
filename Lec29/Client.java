package Lec29;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		StackUsingQueue st = new StackUsingQueue();
		for(int i = 1; i <= 5; i++)
		{
			st.push(i);
			st.display();
		}
		
		System.out.println(st.pop());
		st.display();

	}

}
