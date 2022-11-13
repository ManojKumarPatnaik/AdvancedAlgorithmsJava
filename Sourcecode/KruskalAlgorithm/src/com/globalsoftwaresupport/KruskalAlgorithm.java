package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {

	public void run(List<Vertex> vertexList, List<Edge> edgeList) {
		
		DisjointSet disjointSet = new DisjointSet(vertexList);
		List<Edge> mst = new ArrayList<>();
		
		// use merge sort to sort the edges
		Collections.sort(edgeList);
		
		for(Edge edge : edgeList) {
			
			Vertex u = edge.getStartVertex();
			Vertex v = edge.getTargetVertex();
			
			// the edge is in the MST is the nodes are in different sets
			if(disjointSet.find(u.getNode()) != disjointSet.find(v.getNode())) 
				mst.add(edge);
			
			// we have to merge the sets
			disjointSet.union(u.getNode(), v.getNode());
		}
		
		// we show the MST
		for(Edge e : mst)
			System.out.println(e);
	}
}
