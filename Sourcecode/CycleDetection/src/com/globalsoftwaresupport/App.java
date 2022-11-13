package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Vertex v0 = new Vertex("A");
		Vertex v1 = new Vertex("B");
		Vertex v2 = new Vertex("C");
		Vertex v3 = new Vertex("D");
		Vertex v4 = new Vertex("E");
		Vertex v5 = new Vertex("F");
		
		// we have to handle the connections
		v5.addNeighbor(v0);
		v0.addNeighbor(v4);
		v0.addNeighbor(v2);
		//v4.addNeighbor(v5);
		v2.addNeighbor(v1);
		v2.addNeighbor(v3);
		
		List<Vertex> graph = new ArrayList<>();
		graph.add(v0);
		graph.add(v1);
		graph.add(v2);
		graph.add(v3);
		graph.add(v4);
		graph.add(v5);
		
		CycleDetection algorithm = new CycleDetection();
		algorithm.detectCycles(graph);		
	}
}
