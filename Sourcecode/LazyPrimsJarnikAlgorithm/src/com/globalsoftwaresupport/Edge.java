package com.globalsoftwaresupport;

public class Edge implements Comparable<Edge>{

	private double weight;
	private Vertex startVertex;
	private Vertex targetVertex;
	
	public Edge(Vertex startVertex, Vertex targetVertex, double weight) {
		this.weight = weight;
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}

	@Override
	public int compareTo(Edge otherEdge) {
		// this is how Java can compare edges in the heap data structure
		// the PriorityQueue implementation
		return Double.compare(this.weight, otherEdge.getWeight());
	}	
}
