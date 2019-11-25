package code.TP05.src;

import static java.lang.Math.*;

public class Edge {

	private Node source;
	private Node destination;
	private int distance;
	
	public Edge () {}

	public Edge(Node s, Node d, int dist) {
		this.source = s;
		this.destination = d;
		this.distance = dist;
	}
     

        public Edge(Node s, Node d) {
		this.source = s;
		this.destination = d;
		this.distance = (int) sqrt(pow(d.getLaltitude() - s.getLaltitude(), 2) + pow(d.getLongitude() - s.getLongitude(), 2));
		// A completer
                // La distance de Manhattan est la somme des valeurs absolues de la distance horizontale et de la distance verticale.
                // https://en.wikipedia.org/wiki/Taxicab_geometry
	}
	
	public Node getSource() {
		return source;
	}
	public void setSource(Node source) {
		this.source = source;
	}
	public Node getDestination() {
		return destination;
	}
	public void setDestination(Node destination) {
		this.destination = destination;
	}
	public int getDistance() {
		return distance;
	}
	
	
}
