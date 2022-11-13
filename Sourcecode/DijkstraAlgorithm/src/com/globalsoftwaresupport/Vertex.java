package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

	private String name;
	private boolean visited;
	private List<Edge> adjacencyList;
	// distance from the starting vertex (source)
	private double distance;
	// the previous vertex on the shortest path
	private Vertex predecessor;
	
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

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Edge> getAdjacencyList() {
		return adjacencyList;
	}

	public void addNeighbor(Edge edge) {
		this.adjacencyList.add(edge);
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

	@Override
	public int compareTo(Vertex otherVertex) {
		// v1 < v2 if v1.distance < v2.distance
		// v2 < v1 if v2.distance < v1.distance
		return Double.compare(this.distance, otherVertex.getDistance());
	}

	@Override
	public String toString() {
		return name + "-" + distance;
	}	
}
