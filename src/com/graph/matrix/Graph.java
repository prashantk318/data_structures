package com.graph.matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	ArrayList<GraphNode>nodeList = new ArrayList<>();
	int [][] adjacencymatrix;
	public Graph(ArrayList<GraphNode>nodeList) {
		this.nodeList = nodeList;
		adjacencymatrix = new int [nodeList.size()][nodeList.size()];
	}

	public void addUndirectedEdge(int i,int j) {
		adjacencymatrix[i][j]=1;
		adjacencymatrix[j][i]=1;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("  ");
		for(int i =0;i<nodeList.size();i++) {
			s.append(nodeList.get(i).name +" ");
		}
		s.append("\n");
		for(int i =0;i<nodeList.size();i++) {
			s.append(nodeList.get(i).name+" ");
			for(int j:adjacencymatrix[i]) {
				s.append((j)+" ");
			}
			s.append("\n");
		}
		return s.toString();
	}
	
	//get Neighbours
	public ArrayList<GraphNode> getNeighbours(GraphNode node){
		ArrayList<GraphNode>neighbours = new ArrayList<>();
		int nodeIndex = node.index;
		for(int i =0; i<adjacencymatrix.length;i++) {
			if(adjacencymatrix[nodeIndex][i]==1) {
				neighbours.add(nodeList.get(i));
			}
		}
		return neighbours;
	}
	
	//BSF internal
	
	void bsfVisit(GraphNode node) {
		LinkedList<GraphNode>queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			GraphNode currentNode = queue.remove(0);
			currentNode.Isvisited = true;
			System.out.print(currentNode.name+ " ");
			ArrayList<GraphNode>neighbours = getNeighbours(currentNode);
			for(GraphNode neighbour:neighbours) {
				if(!neighbour.Isvisited) {
				queue.add(neighbour);
				neighbour.Isvisited = true;
				}
			}
			
		}
		
	}
	
	public void bfs() {
		for(GraphNode node:nodeList) {
			if(!node.Isvisited) {
				bsfVisit(node);
			}
		}
	}
	
	void dfsVisit(GraphNode node) {
		Stack<GraphNode>stack = new Stack<>();
		stack.push(node);
		while(!stack.isEmpty()) {
		GraphNode currentNode = stack.pop();
		currentNode.Isvisited = true;
		System.out.print(currentNode.name+ " ");
		ArrayList<GraphNode>neighbours = getNeighbours(currentNode);
		for(GraphNode neighbour:neighbours) {
			if(!neighbour.Isvisited) {
				stack.push(neighbour);
				neighbour.Isvisited = true;
			}
		}
		
		}
	}
	public void dfs() {
		for(GraphNode node:nodeList) {
			if(!node.Isvisited) {
				dfsVisit(node);
			}
		}
	}
	//topological sort
	public void addDirectedEdge(int i, int j) {
		adjacencymatrix[i][j]=1;
	}
	void topologicalVisit(GraphNode node, Stack<GraphNode>stack) {
		ArrayList<GraphNode>neighbours = getNeighbours(node);
		for(GraphNode nodes:neighbours) {
			if(!nodes.Isvisited) {
				topologicalVisit(nodes,stack);
				
			}
			node.Isvisited = true;
			stack.push(node);
		}
		
	}
	
	void topologicalSort() {
		Stack<GraphNode>stack = new Stack<>();
		for(GraphNode node:nodeList) {
			if(!node.Isvisited) {
				topologicalVisit(node, stack);
			}
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().name+" ");
			
		}
	}
	
	
}
