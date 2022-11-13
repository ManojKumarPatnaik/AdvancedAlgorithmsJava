package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Vertex> vertexList = new ArrayList<>();

		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");
		Vertex vertex3 = new Vertex("D");
		Vertex vertex4 = new Vertex("E");
		Vertex vertex5 = new Vertex("F");
		Vertex vertex6 = new Vertex("G");
		
		vertexList.add(vertex0);
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		vertexList.add(vertex3);
		vertexList.add(vertex4);
		vertexList.add(vertex5);
		vertexList.add(vertex6);
		
		vertex0.addEdge(new Edge(vertex0, vertex1, 1));	
		vertex0.addEdge(new Edge(vertex0, vertex2, 2));	
		vertex0.addEdge(new Edge(vertex0, vertex3, 12));
		
		vertex1.addEdge(new Edge(vertex1, vertex0, 1));	
		vertex1.addEdge(new Edge(vertex1, vertex3, 4));	
		vertex1.addEdge(new Edge(vertex1, vertex4, 7));
		vertex1.addEdge(new Edge(vertex1, vertex6, 8));
		
		vertex2.addEdge(new Edge(vertex2, vertex0, 2));	
		vertex2.addEdge(new Edge(vertex2, vertex3, 6));
		vertex2.addEdge(new Edge(vertex2, vertex5, 3));
		
		vertex3.addEdge(new Edge(vertex3, vertex0, 12));	
		vertex3.addEdge(new Edge(vertex3, vertex1, 4));
		vertex3.addEdge(new Edge(vertex3, vertex2, 6));
		vertex3.addEdge(new Edge(vertex3, vertex4, 2));	
		vertex3.addEdge(new Edge(vertex3, vertex5, 5));
		
		vertex4.addEdge(new Edge(vertex4, vertex1, 7));
		vertex4.addEdge(new Edge(vertex4, vertex3, 2));
		vertex4.addEdge(new Edge(vertex4, vertex5, 4));	
		vertex4.addEdge(new Edge(vertex4, vertex6, 9));
		
		vertex5.addEdge(new Edge(vertex5, vertex2, 3));
		vertex5.addEdge(new Edge(vertex5, vertex3, 5));
		vertex5.addEdge(new Edge(vertex5, vertex4, 4));	
		vertex5.addEdge(new Edge(vertex5, vertex6, 2));
		
		vertex6.addEdge(new Edge(vertex6, vertex1, 8));
		vertex6.addEdge(new Edge(vertex6, vertex4, 9));	
		vertex6.addEdge(new Edge(vertex6, vertex5, 2));
		
		LazyPrimsAlgorithm algorithm = new LazyPrimsAlgorithm(vertexList);
		algorithm.run(vertex0);
		algorithm.printSolution();	
	}
}
