package com.graph.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;





public class Graph {
	ArrayList<GraphNode>nodeList = new ArrayList<>();
	
	public Graph(ArrayList<GraphNode>nodeList) {
		this.nodeList = nodeList;
	}
	
	public void addUndirectedEdge(int i,int j) {
		GraphNode first = nodeList.get(i);
		GraphNode second = nodeList.get(j);
		first.neighbours.add(second);
		second.neighbours.add(first);
		}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(int i=0;i<nodeList.size();i++) {
			s.append(nodeList.get(i).name+" : ");
			for(int j=0;j<nodeList.get(i).neighbours.size();j++) {
				if(j==nodeList.get(i).neighbours.size()-1) {
					s.append((nodeList.get(i).neighbours.get(j).name) );
					}
				else{
					s.append((nodeList.get(i).neighbours.get(j).name) + " -> ");
				}
			}
			s.append("\n");
		}
		return s.toString();
	}
//BSF internal
	void bfsVisit(GraphNode node) {
		LinkedList<GraphNode>queue = new LinkedList<GraphNode>();
		queue.add(node);
		while(!queue.isEmpty()) {
			GraphNode currentNode = queue.remove(0);
			currentNode.isVisited = true;
			System.out.print(currentNode.name + " ");
			for(GraphNode neighbour:currentNode.neighbours) {
				if(!neighbour.isVisited) {
				queue.add(neighbour);
				neighbour.isVisited = true;
				}
			}
		}
	}
	void bfs() {
		for(GraphNode node:nodeList) {
			if(!node.isVisited) {
				bfsVisit(node);
			}
		}
	}
	
	//DFS internal
	void dfsVisit(GraphNode node) {
		Stack<GraphNode>stack = new Stack<GraphNode>();
		stack.push(node);
		while(!stack.isEmpty()) {
			GraphNode currentNode = stack.pop();
			currentNode.isVisited = true;
			System.out.print(currentNode.name + " ");
			for(GraphNode neighbour:currentNode.neighbours) {
				if(!neighbour.isVisited) {
					stack.push(neighbour);
					neighbour.isVisited = true;
				}
			}
		}
	}
	
	void dfs() {
		for(GraphNode node:nodeList) {
			if(!node.isVisited) {
				dfsVisit(node);
			}}
	}
}
