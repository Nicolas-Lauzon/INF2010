

import code.TP05.src.*;

import java.util.*;


public class Main {
	
	public static void main(String[] args) {

		System.out.println("TP05 : Graphes");
		
		// Partie 1: A completer : Création du graphe
		List<Node> nodes = new ArrayList<Node>();
		List<Edge> edges = new ArrayList<Edge>();

		Node A = new Node(0, "A");
		Node B = new Node(1, "B");
		Node C = new Node(2, "C");
		Node D = new Node(3, "D");
		Node E = new Node(4, "E");
		Node F = new Node(5, "F");
		Node G = new Node(6, "G");

		edges.add(new Edge(A, B, 2));
		edges.add(new Edge(A, C, 1));
		edges.add(new Edge(B, C, 2));
		edges.add(new Edge(B, D, 1));
		edges.add(new Edge(B, E, 3));
		edges.add(new Edge(C, E, 3));
		edges.add(new Edge(C, F, 5));
		edges.add(new Edge(D, F, 6));
		edges.add(new Edge(D, G, 5));
		edges.add(new Edge(E, F, 1));
		edges.add(new Edge(F, G, 2));
		edges.add(new Edge(D, C, 4));

		Graph g = new Graph(nodes, edges);

		// test de distance
		/*Node testsource = new Node(6, "G", 4, 5);
		Node testdest = new Node(6, "G", 1,1);
		Edge test = new Edge(testsource, testdest);
		System.out.println("distance = " + test.getDistance());*/


		 Partie 2: A completer : Implémentation de l’algorithme Dijkstra
		
		Dijkstra d = new Dijkstra(g);
		
		d.findPath(null, null/* Spécifiez les paramètres */);
		
		d.showTable();

		// Partie 3 : Afficher le chemin le plus court
		System.out.println(d.printShortPath(null, null/* Spécifiez les paramètres */));*/
	
	}
}
