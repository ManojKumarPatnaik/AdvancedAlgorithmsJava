package com.globalsoftwaresupport;

import java.util.List;
import java.util.Stack;

public class TarjanAlgorithm {

	private List<Vertex> graph;
	// we have to track the vertices in the same SCC
	private Stack<Vertex> stack;
	private int index;
	// it will track the integer represenations of the SCCs
	private int sccCounter;
	
	public TarjanAlgorithm(List<Vertex> graph) {
		this.graph = graph;
		this.stack = new Stack<>();
	}
	
	public void run() {
		for(Vertex vertex : graph)
			if(!vertex.isVisited())
				dfs(vertex);
	}

	private void dfs(Vertex vertex) {
		
		vertex.setIndex(index);
		vertex.setLowLink(index);
		index++;
		
		vertex.setVisited(true);
		stack.add(vertex);
		vertex.setOnStack(true);
		
		for(Vertex v : vertex.getAdjacencyList()) {
			
			if(!v.isVisited()) {
				dfs(v);
				// after depth-first search we have to update the low links
				vertex.setLowLink(Math.min(vertex.getLowLink(), v.getLowLink()));
			} else if (v.isOnStack()) {
				vertex.setLowLink(Math.min(v.getIndex(), vertex.getLowLink()));
			}		
		}
		
		// this is what we have to check
		// we have found the root of the SCC
		if(vertex.getIndex() == vertex.getLowLink()) {	
			while(true) {	
				Vertex w = stack.pop();
				w.setOnStack(false);
				w.setComponentId(sccCounter);
				
				if(w == vertex) break;
			}

			sccCounter++;
		}
	}
	
	public void showComponents() {
		for(Vertex vertex : graph)
			System.out.println(vertex);
	}
}
