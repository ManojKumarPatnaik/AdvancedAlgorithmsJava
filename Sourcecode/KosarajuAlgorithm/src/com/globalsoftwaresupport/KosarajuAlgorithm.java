package com.globalsoftwaresupport;

public class KosarajuAlgorithm {

	// we have to make 2 depth-first searches
	// number of strongly-connected components
	private int count;
	// in the second iteration this is how we track the SCCs
	private boolean[] marked;
	
	public KosarajuAlgorithm(Graph graph) {
		
		// first DFS on the G'(V,E) graph
		DepthFirstOrder dfs = new DepthFirstOrder(graph.getTransposedGraph());
		
		marked = new boolean[graph.getVertexList().size()];
		
		// we do another DFS on the original G(V,E) graph
		for(Vertex v : dfs.getStack()) {
			if(!marked[v.getId()]) {
				dfs(v);
				count++;
			}		
		}
	}

	private void dfs(Vertex vertex) {
		
		marked[vertex.getId()] = true;
		vertex.setComponentId(count);
		
		for(Vertex v : vertex.getAdjacencyList())
			if (!marked[v.getId()])
				dfs(v);
	}
	
	public int getCount() {
		return this.count;
	}
}
