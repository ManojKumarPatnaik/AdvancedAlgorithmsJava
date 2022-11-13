package com.globalsoftwaresupport;

public class Edge implements Comparable<Edge> {

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
		// we want to compare edges based on the weight
		// and we need it for the sorting procedure
		return Double.compare(this.weight, otherEdge.getWeight());
	}

	@Override
	public String toString() {
		return startVertex + "" + targetVertex;
	}
}
