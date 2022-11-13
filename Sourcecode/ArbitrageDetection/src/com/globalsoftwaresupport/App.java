package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
List<Vertex> vertexList = new ArrayList<>();
		
		vertexList.add(new Vertex("USD"));
		vertexList.add(new Vertex("EUR"));
		vertexList.add(new Vertex("GBP"));
		vertexList.add(new Vertex("CHF"));
		vertexList.add(new Vertex("CAD"));
		
		List<Edge> edgeList = new ArrayList<>();
		
		edgeList.add(new Edge(vertexList.get(0), vertexList.get(1), -1*Math.log(0.741)));
		edgeList.add(new Edge(vertexList.get(0), vertexList.get(2), -1*Math.log(0.657)));
		edgeList.add(new Edge(vertexList.get(0), vertexList.get(3), -1*Math.log(1.061)));
		edgeList.add(new Edge(vertexList.get(0), vertexList.get(4), -1*Math.log(1.005)));
		
		edgeList.add(new Edge(vertexList.get(1), vertexList.get(0), -1*Math.log(1.349)));
		edgeList.add(new Edge(vertexList.get(1), vertexList.get(2), -1*Math.log(0.888)));
		edgeList.add(new Edge(vertexList.get(1), vertexList.get(3), -1*Math.log(1.433)));
		edgeList.add(new Edge(vertexList.get(1), vertexList.get(4), -1*Math.log(1.366)));
		
		edgeList.add(new Edge(vertexList.get(2), vertexList.get(0), -1*Math.log(1.521)));
		edgeList.add(new Edge(vertexList.get(2), vertexList.get(1), -1*Math.log(1.126)));
		edgeList.add(new Edge(vertexList.get(2), vertexList.get(3), -1*Math.log(1.614)));
		edgeList.add(new Edge(vertexList.get(2), vertexList.get(4), -1*Math.log(1.538)));
		
		edgeList.add(new Edge(vertexList.get(3), vertexList.get(0), -1*Math.log(0.942)));
		edgeList.add(new Edge(vertexList.get(3), vertexList.get(1), -1*Math.log(0.698)));
		edgeList.add(new Edge(vertexList.get(3), vertexList.get(2), -1*Math.log(0.619)));
		edgeList.add(new Edge(vertexList.get(3), vertexList.get(4), -1*Math.log(0.953)));
		
		edgeList.add(new Edge(vertexList.get(4), vertexList.get(0), -1*Math.log(0.995)));
		edgeList.add(new Edge(vertexList.get(4), vertexList.get(1), -1*Math.log(0.732)));
		edgeList.add(new Edge(vertexList.get(4), vertexList.get(2), -1*Math.log(0.650)));
		edgeList.add(new Edge(vertexList.get(4), vertexList.get(3), -1*Math.log(1.049)));
		
		BellmanFordAlgorithm bellmannFordAlgorithm = new BellmanFordAlgorithm(vertexList,edgeList);
		bellmannFordAlgorithm.run(vertexList.get(0));
		
		bellmannFordAlgorithm.printCycle();
	}
}
