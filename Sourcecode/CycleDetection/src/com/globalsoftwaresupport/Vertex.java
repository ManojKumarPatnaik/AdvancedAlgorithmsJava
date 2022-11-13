package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private boolean beingVisited;
	private List<Vertex> adjacenciesList;
	
	public Vertex(String name) {
		this.name = name;
		this.adjacenciesList = new ArrayList<>();
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean isBeingVisited) {
		this.beingVisited = isBeingVisited;
	}

	public List<Vertex> getNeighbors() {
		return adjacenciesList;
	}

	public void addNeighbor(Vertex vertex) {
		this.adjacenciesList.add(vertex);
	}

	@Override
	public String toString() {
		return name;
	}	
}
