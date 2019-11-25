package code.TP05.src;

import java.util.ArrayList;
import java.util.List;
import code.TP05.src.*;

public class Graph {

	private List<Node> nodes; // Noeuds
	private List<Edge> edges; // Les arcs
	
	public Graph(List<Node> nodes, List<Edge> edges) {
		this.nodes = nodes;
		this.edges = edges;
	}
	
	public List<Edge> getEdgesGoingFrom(Node source) {
		List<Edge> edgeFromSource = new ArrayList<Edge>();
		for(int i = 0; i < edges.size(); i++){
			Edge tempEdge = edges.get(i);
			if(tempEdge.getSource() == source) edgeFromSource.add(tempEdge);
		}
		return edgeFromSource;
		
	}
	public List<Edge> getEdgesGoingTo(Node dest) {
		List<Edge> edgeFromSource = new ArrayList<Edge>();
		for(int i = 0; i < edges.size(); i++){
			Edge tempEdge = edges.get(i);
			if(tempEdge.getDestination() == dest) edgeFromSource.add(tempEdge);
		}
		return edgeFromSource;
	}
	
	// Accesseurs 
	public List<Node> getNodes() {
		return nodes;
	}
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	public List<Edge> getEdges() {
		return edges;
	}
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
}
