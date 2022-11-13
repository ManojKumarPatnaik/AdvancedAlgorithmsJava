package com.globalsoftwaresupport;

public class MazeSolver {

	private int startRow;
	private int startCol;
	private int[][] maze;
	private boolean[][] visited;
	
	public MazeSolver(int[][] maze, int startRow, int startCol) {
		this.maze = maze;
		this.visited = new boolean[maze.length][maze.length];
		this.startRow = startRow;
		this.startCol = startCol;
	}
	
	public void findWay() {
		if(dfs(startRow, startCol)) 
			System.out.println("Solution exists...");
		else
			System.out.println("No solution exists...");		
	}
	
	private boolean isFeasible(int x, int y) {
		
		// we check the vertical dimension
		if(x<0 || x>maze.length-1)
			return false;
		
		// we check the horizontal dimension
		if(y<0 || y>maze.length-1)
			return false;
		
		// when we have already considered that state
		if(visited[x][y]) 
			return false;
		
		// there is an obstacle in the way
		if(maze[x][y]==1)
			return false;
		
		return true;
	}

	private boolean dfs(int x, int y) {
		
		// base-case
		if(x==maze.length-1 && y==maze.length-1)
			return true;
		
		if(isFeasible(x,y)) {
			
			visited[x][y] = true;
			
			// then we have to visit the next cells (U,D,L,R)
			// going down
			if(dfs(x+1,y))
				return true;
			
			// going up
			if(dfs(x-1,y))
				return true;
			
			// going to the right
			if(dfs(x,y+1))
				return true;
			
			// going to the left
			if(dfs(x,y-1))
				return true;
			
			// BACKTRACK
			visited[x][y] = false;
			return false;
		}
		
		return false;
	}
}










