package com.globalsoftwaresupport;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearchRecursion {
	
	public void dfs(List<Vertex> vertexList) {
		
		// it may happen that we have independent clusters
		for(Vertex v : vertexList) {
			if(!v.isVisited()) {
				v.setVisited(true);
				dfsHelper(v);
			}
		}			
	}

	private void dfsHelper(Vertex vertex) {
		
		System.out.println(vertex);
		
		for(Vertex v : vertex.getNeighbors()) {
			if(!v.isVisited()) {
				v.setVisited(true);
				dfsHelper(v);
			}
		}	
	}
}










