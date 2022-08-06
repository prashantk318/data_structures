package com.graph.list;

import java.util.ArrayList;

public class GraphNode {
	public String name;
	public int index;
	public boolean isVisited = false;
	
	public GraphNode parent;
	
	public ArrayList<GraphNode>neighbours = new ArrayList<>();
	
	public GraphNode(String name, int index) {
		this.name = name;
		this.index = index;
	}

}
