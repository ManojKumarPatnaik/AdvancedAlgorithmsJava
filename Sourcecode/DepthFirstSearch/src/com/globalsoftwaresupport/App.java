package com.globalsoftwaresupport;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Vertex v1 = new Vertex("A");
		Vertex v2 = new Vertex("B");
		Vertex v3 = new Vertex("C");
		Vertex v4 = new Vertex("D");
		Vertex v5 = new Vertex("E");
		Vertex v6 = new Vertex("F");
		Vertex v7 = new Vertex("G");
		Vertex v8 = new Vertex("H");
		
		List<Vertex> list = new ArrayList<>();
		v1.addNeighbor(v2);
		v1.addNeighbor(v6);
		v1.addNeighbor(v7);
		v2.addNeighbor(v3);
		v2.addNeighbor(v4);
		v4.addNeighbor(v5);
		v7.addNeighbor(v8);
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		list.add(v6);
		list.add(v7);
		list.add(v8);
		
		DepthFirstSearchRecursion dfs = new DepthFirstSearchRecursion();
		dfs.dfs(list);
	}
}
