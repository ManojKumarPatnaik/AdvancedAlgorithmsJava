package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	// the distance from the source vertex (infinity)
	private double distance;
	// the previous vertex on the shortest path
	private Vertex predecessor;
	private List<Edge> adjacencyList;
	
	public Vertex(String name) {
		this.name = name;
		this.adjacencyList = new ArrayList<>();
		this.distance = Double.MAX_VALUE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public List<Edge> getAdjacencyList() {
		return adjacencyList;
	}

	public void addNeighbor(Edge edge) {
		this.adjacencyList.add(edge);
	}

	@Override
	public String toString() {
		return name;
	}	
}
