package Lec38;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,15,30,40,50,65,70};
		BinarySearchTree bst = new BinarySearchTree();
		bst.createTree(arr);
		bst.display();
//		System.out.println(bst.find(55));
		System.out.println("------------------------------");
//		bst.add2(55);
		bst.display();
		
//		System.out.println("------------------------------");
//		bst.remove(40);
//		bst.display();
		
//		System.out.println("------------------------------");
//		bst.rws();
//		bst.display();
		
		
		System.out.println("-------------------------------");
		bst.pir(20, 60);

	}

}
