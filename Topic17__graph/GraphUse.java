package topic17_graph;

public class GraphUse {

	public static void main(String[] args) {
		Graph graph = new Graph();
	
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addEdge("A", "B");
		graph.addEdge("A", "C");
		graph.addEdge("A", "F");
		graph.addEdge("B", "F");
		graph.addEdge("A", "C");
		graph.addEdge("C", "D");
		graph.addEdge("D", "F");
		
		graph.removeVertex("F");
		graph.printGraph();
		graph.removeEdge("A", "B");
		graph.printGraph();
		
	}
}
