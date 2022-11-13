package LongestPath;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Vertex> vertexList = new ArrayList<>();
		
		vertexList.add(new Vertex("S"));
		vertexList.add(new Vertex("A"));
		vertexList.add(new Vertex("B"));
		vertexList.add(new Vertex("C"));
		vertexList.add(new Vertex("D"));
		vertexList.add(new Vertex("E"));
		
		// use Bellman Ford because Dijkstra cannot be used on negative weighted graphs
		// negate all edge weights -> and tun Bellman Ford, the abs|f| will be the longest path and the path
		// can be traversed with the help of getPreviousVertex() 
		
		List<Edge> edgeList = new ArrayList<>();
		
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(1),-1));
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(3),-2));
		
		edgeList.add(new Edge(vertexList.get(1),vertexList.get(2),-6));
		
		edgeList.add(new Edge(vertexList.get(2),vertexList.get(4),-1));
		edgeList.add(new Edge(vertexList.get(2),vertexList.get(5),-2));
		
		edgeList.add(new Edge(vertexList.get(3),vertexList.get(1),-4));
		edgeList.add(new Edge(vertexList.get(3),vertexList.get(4),-3));
		
		edgeList.add(new Edge(vertexList.get(4),vertexList.get(5),-1));
		
		BellmanFord bellmannFordAlgorithm = new BellmanFord(vertexList,edgeList);
		bellmannFordAlgorithm.bellmanFord(vertexList.get(0),vertexList.get(5));
		
	}
}
