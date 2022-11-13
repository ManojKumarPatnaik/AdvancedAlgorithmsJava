package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private List<Vertex> adjacencyList;
	
	public Vertex(String name) {
		this.name = name;
		this.adjacencyList = new ArrayList<>();
	}
	
	public void addNeighbor(Vertex v) {
		adjacencyList.add(v);
	}
	
	public List<Vertex> getNeighbors() {
		return adjacencyList;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	@Override
	public String toString() {
		return name;
	}
}
