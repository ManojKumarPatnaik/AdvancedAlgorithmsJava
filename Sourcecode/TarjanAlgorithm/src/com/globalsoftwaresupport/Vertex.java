package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private List<Vertex> adjacencyList;
	private boolean visited;
	private boolean onStack;
	private int index;
	private int lowLink;
	private int componentId;
	
	public Vertex(String name) {
		this.name = name;
		this.adjacencyList = new ArrayList<>();
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void addNeighbor(Vertex v) {
		this.adjacencyList.add(v);
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isOnStack() {
		return onStack;
	}

	public void setOnStack(boolean onStack) {
		this.onStack = onStack;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getLowLink() {
		return lowLink;
	}

	public void setLowLink(int lowLink) {
		this.lowLink = lowLink;
	}

	public int getComponentId() {
		return componentId;
	}

	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}

	@Override
	public String toString() {
		return "Vertex " + name + " belongs to component" + componentId;
	}
	
	
}
