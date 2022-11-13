package com.globalsoftwaresupport;

import java.util.Stack;

public class DepthFirstOrder {

	private Stack<Vertex> stack;
	
	public DepthFirstOrder(Graph graph) {
		
		stack = new Stack<>();
			
		// there may be independent clusters and we want to
		// visit all the vertices
		for(Vertex v : graph.getVertexList()) {
			if(!v.isVisited())
				dfs(v);
		}
	}

	private void dfs(Vertex vertex) {
		
		vertex.setVisited(true);
		
		for(Vertex v : vertex.getAdjacencyList())
			if(!v.isVisited())
				dfs(v);
		
		// after a node has been visited we push it
		// onto a stack (that will be processed)
		stack.push(vertex);
	}
	
	public Stack<Vertex> getStack() {
		return this.stack;
	}
}
