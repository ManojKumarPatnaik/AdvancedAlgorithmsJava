package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Vertex> vertexList = new ArrayList<>();
		
		vertexList.add(new Vertex(0, "A"));
		vertexList.add(new Vertex(1, "B"));
		vertexList.add(new Vertex(2, "C"));
		vertexList.add(new Vertex(3, "D"));
		vertexList.add(new Vertex(4, "E"));
		vertexList.add(new Vertex(5, "F"));
		vertexList.add(new Vertex(6, "G"));
		vertexList.add(new Vertex(7, "H"));
		
		List<Edge> edgeList = new ArrayList<Edge>();
		
		edgeList.add(new Edge(1, vertexList.get(0), vertexList.get(1)));
		
		edgeList.add(new Edge(1, vertexList.get(1), vertexList.get(2)));
		edgeList.add(new Edge(1, vertexList.get(1), vertexList.get(4)));
		edgeList.add(new Edge(1, vertexList.get(1), vertexList.get(5)));
		
		edgeList.add(new Edge(1, vertexList.get(2), vertexList.get(3)));
		edgeList.add(new Edge(1, vertexList.get(2), vertexList.get(6)));
		
		edgeList.add(new Edge(1, vertexList.get(3), vertexList.get(2)));
		edgeList.add(new Edge(1, vertexList.get(3), vertexList.get(7)));
		
		edgeList.add(new Edge(1, vertexList.get(4), vertexList.get(0)));
		edgeList.add(new Edge(1, vertexList.get(4), vertexList.get(5)));
		
		edgeList.add(new Edge(1, vertexList.get(5), vertexList.get(6)));
		
		edgeList.add(new Edge(1, vertexList.get(6), vertexList.get(5)));
		
		edgeList.add(new Edge(1, vertexList.get(7), vertexList.get(3)));
		edgeList.add(new Edge(1, vertexList.get(7), vertexList.get(6)));
		
		Graph graph = new Graph(vertexList, edgeList);
		KosarajuAlgorithm algorithm = new KosarajuAlgorithm(graph);
		System.out.println(algorithm.getCount());
		
		for(Vertex vertex : vertexList)
			System.out.println(vertex + " - " + vertex.getComponentId());
	}
}
