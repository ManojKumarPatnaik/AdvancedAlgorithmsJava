package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Vertex vertex0 = new Vertex("A"	);	
		Vertex vertex1 = new Vertex("B"	);	
		Vertex vertex2 = new Vertex("C"	);	
		Vertex vertex3 = new Vertex("D"	);	
		Vertex vertex4 = new Vertex("E"	);	
		Vertex vertex5 = new Vertex("F"	);	
		Vertex vertex6 = new Vertex("G"	);
		Vertex vertex7 = new Vertex("H"	);
		
		List<Vertex> vertexList = new ArrayList<>();
		
		vertexList.add(vertex0);
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		vertexList.add(vertex3);
		vertexList.add(vertex4);
		vertexList.add(vertex5);
		vertexList.add(vertex6);
		vertexList.add(vertex7);
		
		List<Edge> edgeList = new ArrayList<>();
		
		edgeList.add(new Edge(5, vertex0, vertex1));
		edgeList.add(new Edge(9, vertex0, vertex4));
		edgeList.add(new Edge(8, vertex0, vertex7));
		
		edgeList.add(new Edge(12, vertex1, vertex2));
		edgeList.add(new Edge(15, vertex1, vertex3));
		edgeList.add(new Edge(4, vertex1, vertex7));
		
		edgeList.add(new Edge(3, vertex2, vertex3));
		edgeList.add(new Edge(11, vertex2, vertex6));
		
		edgeList.add(new Edge(9, vertex3, vertex6));
		
		edgeList.add(new Edge(4, vertex4, vertex5));
		edgeList.add(new Edge(20, vertex4, vertex6));
		edgeList.add(new Edge(5, vertex4, vertex7));
		
		edgeList.add(new Edge(1, vertex5, vertex2));
		edgeList.add(new Edge(13, vertex5, vertex7));
		
		edgeList.add(new Edge(7, vertex7, vertex2));
		edgeList.add(new Edge(6, vertex7, vertex5));
		
		BellmanFordAlgorithm algorithm = new BellmanFordAlgorithm(vertexList, edgeList);
		algorithm.run(vertexList.get(0));	
		algorithm.shortestPathTo(vertexList.get(3));
	}
}
