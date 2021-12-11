package Lec28;

public class DSClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
//		DynamicStack st = new DynamicStack();
//		
//		st.push(1);
//		st.push(2);
//		st.push(3);
//		st.push(4);
//		st.push(5);
//		st.push(6);
//		
//		st.display();
		
		DynamicQueue qt = new DynamicQueue();
		for(int i = 0; i <= 10; i++)
		{
			qt.enqueue(i);
			qt.display();
		}
		
		

	}

}
