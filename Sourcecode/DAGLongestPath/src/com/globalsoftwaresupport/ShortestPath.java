package com.globalsoftwaresupport;

import java.util.List;
import java.util.Stack;

public class ShortestPath {

	private TopologicalOrdering topologicalOrdering;
	
	public ShortestPath(List<Vertex> graph) {
		this.topologicalOrdering = new TopologicalOrdering(graph);
		graph.get(0).setMinDistance(0);
	}
	
	public void compute() {
		
		Stack<Vertex> topologicalOrder = topologicalOrdering.getStack();
		
		while(!topologicalOrder.isEmpty()) {
			
			Vertex u = topologicalOrder.pop();
			
			for(Edge e : u.getNeighbors()) {
				
				Vertex v = e.getTarget();
				
				if(v.getMinDistance() > u.getMinDistance() + e.getWeight()) {
					v.setMinDistance(u.getMinDistance()+e.getWeight());
					v.setPredecessor(u);
				}			
			}		
		}
	}
}








