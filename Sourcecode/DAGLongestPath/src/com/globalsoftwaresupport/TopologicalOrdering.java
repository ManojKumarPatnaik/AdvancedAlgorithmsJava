package com.globalsoftwaresupport;

import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {

	private Stack<Vertex> stack;
	
	public TopologicalOrdering(List<Vertex> graph){
		
		this.stack = new Stack<>();
		
		for(int i=0;i<graph.size();i++) {
			if(!graph.get(i).isVisited()){
				dfs(graph.get(i));
			}
		}
	}
	
	private void dfs(Vertex vertex){	
		
		vertex.setVisited(true);
		
		for(Edge e : vertex.getNeighbors()){
			if( !e.getTarget().isVisited()){
				dfs(e.getTarget());
			}
		}
		
		stack.add(vertex);
	}
	
	public Stack<Vertex> getStack(){
		return this.stack;
	}
}
