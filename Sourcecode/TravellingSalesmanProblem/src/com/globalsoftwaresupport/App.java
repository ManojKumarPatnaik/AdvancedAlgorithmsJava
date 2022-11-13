package com.globalsoftwaresupport;

public class App {

	public static void main(String[] args) {
		
		// adjacency matrix (graph)
		int[][] graph = {{0, 1, 0, 0, 1},
						 {1, 0, 1, 1, 0},
						 {0, 1, 0, 1, 1},
						 {0, 1, 1, 0, 1},
						 {1, 0, 1, 1, 0}};
		
		
		TravellingSalesmanProblem tsp = new TravellingSalesmanProblem(graph);
		// starting vertex has index 0
		// 1 we start with the first iteration
		// cost is equals to 0
		tsp.solve(0, 1, 0);
		tsp.show();
	}
}
