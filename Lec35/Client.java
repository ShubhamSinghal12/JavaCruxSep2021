package Lec35;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10 true 20 true 400 false true 70 false false true 50 false false true 30 true 60 false false false
		
		//10 true 20 true 40 false true 70 false false false true 30 true 60 false false false
		
		
		BinaryTree bt = new BinaryTree();
		bt.createTree();
		bt.display();
		
		System.out.println("------------------------------");
		System.out.println(bt.max());
		System.out.println(bt.search(50));
		System.out.println(bt.size());
		System.out.println(bt.ht());
		
		System.out.println("---------------------------");
//		bt.postorder();
		bt.levelbylevelOrder2();
		System.out.println();
		System.out.println("---------------------------");
		System.out.println(bt.isBal2());
		
		System.out.println("---------------------------");
		bt.TopView();
		
		
		

	}

}
