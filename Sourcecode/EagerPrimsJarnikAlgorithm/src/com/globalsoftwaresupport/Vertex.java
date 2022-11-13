package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{

	private String name;
	// shortest edge from tree vertex to non-tree vertex
	private Edge minEdge;        
	private boolean visited;
	// to detect whether heap is in need of refresh because of better weighted edge
	private double distance = Double.MAX_VALUE;   
	private List<Edge> adjacencies;

	public Vertex(String name) {
		this.name = name;
		this.adjacencies = new ArrayList<>();
	}
	
	public void addEdge(Edge edge){
		this.adjacencies.add(edge);
	}

	public Edge getMinEdge() {
		return minEdge;
	}

	public void setMinEdge(Edge minEdge) {
		this.minEdge = minEdge;
	}

	public List<Edge> getAdjacencies() {
		return adjacencies;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	@Override
	public String toString() {
		return ""+this.name;
	}

	@Override
	public int compareTo(Vertex otherVertex) {
		return Double.compare(this.distance, otherVertex.getDistance());
	}
}