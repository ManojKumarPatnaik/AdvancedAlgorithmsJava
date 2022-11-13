package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	
	public Graph() {
		
	}
	
	public Graph(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

	public List<Edge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}
	
	// this is how we transpose a given G(V,E) graph
	public Graph getTransposedGraph() {
		
		Graph transposedGraph = new Graph();
		
		List<Vertex> transposedList = new ArrayList<>();
		
		// the transposed G'(V,E) contains the exact same vertices
		for(Vertex vertex : this.vertexList)
			transposedList.add(vertex);
		
		// revert the edges (A-C will be C-A)
		for(Edge edge : this.edgeList)
			transposedList.get(edge.getTargetVertex().getId()).addNeighbor(edge.getStartVertex());
		
		transposedGraph.setVertexList(transposedList);
		
		return transposedGraph;
	}
}







