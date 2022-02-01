package Lec45;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Undirected Graph
//		Graph gh = new Graph(7);
//		
//		gh.addEdge(1, 2, 65);
//		gh.addEdge(1, 3, 10);
//		gh.addEdge(4, 2, 30);
//		gh.addEdge(3, 4, 20);
//		gh.addEdge(5, 2, 80);
//		gh.addEdge(5,6, 90);
//		gh.addEdge(5, 7, 14);
//		gh.addEdge(6, 7, 5);
		
//		Directed Graph
		
		Graph gh = new Graph(5);
		gh.addEdge(1, 2, 8);
		gh.addEdge(1, 3, 4);
		gh.addEdge(1, 4, 5);
		gh.addEdge(3,4, -3);
		gh.addEdge(4, 5, 4);
		gh.addEdge(5, 2, -2);
		gh.addEdge(2, 5, 1);
		
		gh.display();
		
//		System.out.println(gh.noOfEdges());
//		System.out.println(gh.noOfVertices());
//		gh.removeEdge(2, 5);
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
//		System.out.println(gh.allConnectedComponents());
//		gh.display();
		
//		gh.krushkal();
//		gh.Prims();
//		gh.Dijakstra();
		gh.bellmonFord(1);
		
		
		

	}

}
