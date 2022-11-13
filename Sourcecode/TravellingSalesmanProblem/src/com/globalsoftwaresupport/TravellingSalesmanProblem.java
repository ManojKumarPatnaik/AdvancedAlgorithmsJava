package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class TravellingSalesmanProblem {

	// adjacency matrix representation of the G(V,E)
	private int[][] graph;
	// we have to track whether we have visited the given nodes
	private boolean[] visited;
	// we have to track the path (that may form a cycle)
	private List<Integer> path;
	// because we are after the MINIMUM hamiltonian cycle
	private int min;
	
	public TravellingSalesmanProblem(int[][] graph) {
		this.graph = graph;
		this.visited = new boolean[graph.length];
		this.path = new ArrayList<>();
		
		initilaize();
	}

	private void initilaize() {
		// start with vertex index 0
		visited[0] = true;
		path.add(0);
		min = Integer.MAX_VALUE;
	}
	
	private boolean isValid(int vertex, int actualPosition) {
		
		// if the vertex is already been visited then it is not good
		if(visited[vertex])
			return false;
		
		// is there a connection between the 2 vertices?
		if(graph[actualPosition][vertex] == 0)
			return false;
		
		return true;
	}
	
	public void solve(int actualPosition, int counter, int cost) {
		
		// base-case
		// we have considered all the vertices in the G(V,E) graph
		// AND there is a connection between the last and first nodes
		if(counter == graph.length && graph[actualPosition][0] != 0) {
			path.add(0);
			path.forEach(num -> System.out.print(num+" "));
			System.out.println("\nCOST: "+ (cost + graph[actualPosition][0])+"\n");
			
			// tracking the minimum route
			if(cost + graph[actualPosition][0] < min)
				min = cost + graph[actualPosition][0];
			
			// remove the last node
			path.remove(path.size()-1);
			return;
		}
		
		// we have to consider all the i vertices in the G(V,E)
		for(int i=0;i<graph.length;++i) {
			if(isValid(i, actualPosition)) {
				visited[i] = true;
				path.add(i);
				solve(i, counter + 1, cost + graph[actualPosition][i]);			
				// BACKTRACK
				visited[i] = false;
				path.remove(path.size()-1);
			}
		}
	}
	
	public void show() {
		System.out.println("Min hamiltonian cycle: " + min);
	}
}
