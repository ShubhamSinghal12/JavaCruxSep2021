package Lec37;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pre[] = {100,20,50,60,70,40,80,90};
		int in[] = {50,20,70,60,100,40,90,80};
		
		BinaryTree2 bt = new BinaryTree2();
//		bt.createTree(pre, in);
		
		
		// 10 20 30 40 50 -1 60 -1 -1 70 -1 -1 -1 -1 -1
		
		bt.createTreeUsingLevelOrder();
		bt.display();
//		System.out.println(bt.dia2());
//		
//		System.out.println("--------------------------");
//		bt.leftTreeView();
		
		System.out.println("--------------------------");
		//140 20 160 10 30 50 80 -1 -1 -1 -1 -1 -1 -1 -1
		System.out.println(bt.maxBST());

	}

}
