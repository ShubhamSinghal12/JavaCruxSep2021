package Lec45;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph gh = new Graph(7);
		
		gh.addEdge(1, 2, 60);
		gh.addEdge(1, 3, 10);
		gh.addEdge(4, 2, 30);
		gh.addEdge(3, 4, 20);
		gh.addEdge(5, 2, 80);
		gh.addEdge(5,6, 90);
		gh.addEdge(5, 7, 14);
		gh.addEdge(6, 7, 5);
		
		gh.display();
		
		System.out.println(gh.noOfEdges());
		System.out.println(gh.noOfVertices());
		gh.removeEdge(2, 5);
//		gh.removeEdge(3, 4);
//		gh.removeEdge(7, 6);
//		gh.removeVertex(2);
		System.out.println("------------------------");
//		System.out.println(gh.hasPath(1, 6));
//		gh.printAllPath(1, 6);
//		System.out.println(gh.hasPathDFS(1, 6));
//		gh.BFST();
//		System.out.println(gh.isCycle());
//		System.out.println(gh.noOfConnectedComponents());
		System.out.println(gh.allConnectedComponents());
//		gh.display();
		
		
		

	}

}
