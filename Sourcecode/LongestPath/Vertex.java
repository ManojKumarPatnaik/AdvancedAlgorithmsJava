package LongestPath;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private int minDistance = Integer.MAX_VALUE;
	private Vertex previousVertex;
	private List<Edge> adjacencies;

	public Vertex(String name) {
		this.name = name;
		this.adjacencies = new ArrayList<>();
	}

	public int getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(int minDistance) {
		this.minDistance = minDistance;
	}

	public Vertex getPreviousVertex() {
		return previousVertex;
	}
	
	public void addEdge(Edge edge){
		this.adjacencies.add(edge);
	}

	public List<Edge> getAdjacencies() {
		return adjacencies;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
