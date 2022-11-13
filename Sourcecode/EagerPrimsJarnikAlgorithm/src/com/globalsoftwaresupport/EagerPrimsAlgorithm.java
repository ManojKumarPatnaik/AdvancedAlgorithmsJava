package com.globalsoftwaresupport;

import java.util.List;
import java.util.PriorityQueue;

public class EagerPrimsAlgorithm {

	private List<Vertex> vertexList;
	private PriorityQueue<Vertex> heap;
	
	public EagerPrimsAlgorithm(List<Vertex> vertexList){
		this.vertexList = vertexList;
		this.heap = new PriorityQueue<>();
	}
	
	public void run(Vertex vertex){
		
		vertex.setDistance(0);
		heap.add(vertex);
		
		while(!heap.isEmpty()){
			Vertex v = heap.remove();
			scanVertex(v);
		}
	}

	private void scanVertex(Vertex vertex) {
		
		vertex.setVisited(true);
		
		// consider all the edges of the given vertex
		for(Edge edge : vertex.getAdjacencies()){
			
			Vertex w = edge.getTargetVertex();
			
			// we do not want to revisit already visited vertices
			if(w.isVisited()) continue;
			
			// there is a "shorter path" to the unvisited vertex set
			// from the visited vertex cluster
			if(edge.getWeight() < w.getDistance()){
				w.setDistance(edge.getWeight());
				w.setMinEdge(edge);
				
				if( this.heap.contains(w) ){
					this.heap.remove(w);
				}
				
				this.heap.add(w);
			}		
		}
	}
	
	public void printSolution() {
		
		double cost = 0;
		
		for(Vertex vertex : vertexList){
			if( vertex.getMinEdge() != null ){
				Edge edge = vertex.getMinEdge();
				System.out.println("Edge: " + edge);
				cost += edge.getWeight();
			}
		}
		
		System.out.println("Cost of MST: " + cost);
	}
} 
