package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class BellmanFordAlgorithm {

	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	private List<Vertex> cycleList;
	
	public BellmanFordAlgorithm(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
		this.cycleList = new ArrayList<>();
	}
	
	// Bellman-Ford algorithm
	public void run(Vertex source) {
		
		source.setDistance(0);
		
		// V-1 iterations (in worst-case the longest path contains V
		for(int i=0;i<vertexList.size()-1;++i) {
			
			// RELAXATION
			for(Edge edge : edgeList) {
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();
				
				if(u.getDistance() + edge.getWeight() < v.getDistance()) {
					v.setDistance(u.getDistance() + edge.getWeight());
					v.setPredecessor(u);
				}
			}			
		}
		
		// if we make an additional relaxation and there is shorter paths
		// then we know that there is a negative cycle in the network
		for(Edge edge : edgeList) {
			if(edge.getStartVertex().getDistance() != Double.MAX_VALUE) {
				if(hasCycle(edge)) {
					System.out.println("There is a negative cycle...");
					
					Vertex vertex = edge.getStartVertex();
					
					while( !vertex.equals(edge.getTargetVertex())) {
						this.cycleList.add(vertex);
						vertex = vertex.getPredecessor();
					}
					
					this.cycleList.add(edge.getTargetVertex());
					
					return;
				}
			}
		}
	}

	private boolean hasCycle(Edge edge) {
		return edge.getStartVertex().getDistance() + edge.getWeight() < 
				edge.getTargetVertex().getDistance();
	}
	
	public void printCycle() {
		if( this.cycleList != null ){
			for(Vertex vertex : this.cycleList){
				System.out.println(vertex);
			}
		}else{
			System.out.println("No arbitrage opportunity...");
		}
	}
}
