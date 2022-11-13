package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Vertex vertex1 = new Vertex("1");
		Vertex vertex2 = new Vertex("2");
		Vertex vertex3 = new Vertex("3");
		Vertex vertex4 = new Vertex("4");
		Vertex vertex5 = new Vertex("5");
		Vertex vertex6 = new Vertex("6");
		Vertex vertex7 = new Vertex("7");
		Vertex vertex8 = new Vertex("8");
		
		vertex1.addNeighbor(vertex2);
		
		vertex2.addNeighbor(vertex3);
		vertex2.addNeighbor(vertex5);
		vertex2.addNeighbor(vertex6);
		
		vertex3.addNeighbor(vertex4);
		vertex3.addNeighbor(vertex7);
		
		vertex4.addNeighbor(vertex8);
		vertex4.addNeighbor(vertex3);
		
		vertex5.addNeighbor(vertex1);
		vertex5.addNeighbor(vertex6);
		
		vertex6.addNeighbor(vertex7);
		vertex7.addNeighbor(vertex6);
		vertex8.addNeighbor(vertex4);
		vertex8.addNeighbor(vertex7);	
		
		List<Vertex> graph = new ArrayList<>();
		graph.add(vertex6);
		graph.add(vertex7);
		graph.add(vertex5);
		graph.add(vertex1);
		graph.add(vertex2);
		graph.add(vertex3);
		graph.add(vertex4);		
		graph.add(vertex8);
		
		TarjanAlgorithm algorithm = new TarjanAlgorithm(graph);
		algorithm.run();
		algorithm.showComponents();
	}
}
