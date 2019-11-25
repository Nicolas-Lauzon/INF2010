package code.TP05.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;



public class Dijkstra {

	private Graph graph;
	private Map<Node, Edge> dijkstraTable[];
	private Stack<Edge> path;
	

	public Dijkstra (Graph g) {
		this.graph = g;
	}

	public void findPath(Node s, Node d) {

		dijkstraTable = new HashMap[graph.getNodes().size()];
		path = new Stack<Edge>();
		Node currentNode = s;
		Node[] visitedNodes = new Node[]();
		while(currentNode != d){
			int bestDistance = 100;
			Node bestNode = s;
			for(int i = 0; i < graph.getEdgesGoingFrom(currentNode).size(); i++){
				if(graph.getEdgesGoingFrom(s).get(i).getDistance() < bestDistance){
					bestNode = graph.getEdgesGoingFrom(s).get(i).getDestination();
				}
			}
			dijkstraTable[1].put(currentNode, )
		}

// finir en prenant en compte les distances des noeuds pr/c/dents
		while

		
	}

	private Node getMinimum(Map<Node, Edge> map) {
		Edge min = null;
		for (Node Key : map.keySet()) {
			if ( min == null || map.get(Key).getDistance() < min.getDistance()) {
				min = map.get(Key); 
			}
		}
		return min.getDestination();
	}

	private Edge getMinimum (Edge e1, Edge e2) {
		// A completer
		return null;
	}
	
	public String printShortPath(Node source, Node destination) {
		// A completer
		return null;
	}

	public void showTable() {
		// A completer
		
	}
}
