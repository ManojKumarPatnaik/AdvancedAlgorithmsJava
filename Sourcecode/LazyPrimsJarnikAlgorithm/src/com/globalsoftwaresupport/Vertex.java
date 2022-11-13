package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private List<Edge> adjacencyList;
	
	public Vertex(String name) {
		this.name = name;
		this.adjacencyList = new ArrayList<>();
	}
	
	public void addEdge(Edge edge) {
		this.adjacencyList.add(edge);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Edge> getAdjacencyList() {
		return adjacencyList;
	}

	@Override
	public String toString() {
		return name;
	}
}
