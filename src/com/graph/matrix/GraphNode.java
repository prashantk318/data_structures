package com.graph.matrix;

public class GraphNode {
	public String name;
	public int index;
	
	public boolean Isvisited = false;
	GraphNode parent;
	
	public GraphNode(String name, int index) {
		this.name = name;
		this.index = index;
	}

}
