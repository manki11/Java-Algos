package topic17_graph;

public class Edge {
	Vertex first;
	Vertex second;
	int length;
	Edge(Vertex first, Vertex second){
		this.first = first;
		this.second = second;
	}
}
