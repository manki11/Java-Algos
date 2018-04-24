package topic17_graph;

import java.util.ArrayList;

public class Vertex {

	String name;
	private ArrayList<Edge> edges;

	Vertex(String name) {
		this.name = name;
		this.edges = new ArrayList<>();
	}

	boolean isAdjacent(Vertex v) {
		for (Edge e : edges) {
			if (e.first.name.equals(v.name) || e.second.name.equals(v.name)) {
				return true;
			}
		}
		return false;
	}

	void addEdge(Edge e) {
		edges.add(e);
	}

	boolean removeEdgeWith(Vertex v) {
		for (int i = 0; i < edges.size(); i++) {
			if (edges.get(i).first == v || edges.get(i).second == v) {
				edges.remove(i);
				return true;
			}
		}
		return false;
	}
	
	
	ArrayList<Vertex> getAdjacentVertices(){
		ArrayList<Vertex> adjacentVertices = new ArrayList<>();
		for(Edge e: edges){
			if(e.first==this){
				adjacentVertices.add(e.second);
			}else{
				adjacentVertices.add(e.first);
			}
		}
		return adjacentVertices;
	}
	
	
	void print(){
		StringBuilder toBePrinted= new StringBuilder("");
		toBePrinted.append(name).append(" : ");
		for(Edge e: edges){
			if(e.first==this){
				toBePrinted.append(e.second.name).append(" , ");
			}else{
				toBePrinted.append(e.first.name).append(" , ");
			}
		}
		System.out.println(toBePrinted);
		
	}
	
	
	
	
	
	
	
}
