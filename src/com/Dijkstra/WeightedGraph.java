package com.Dijkstra;

import java.util.ArrayList;
import java.util.PriorityQueue;


public class WeightedGraph {
	ArrayList<WeightedNode>nodeList = new ArrayList<>();
	
	public WeightedGraph(ArrayList<WeightedNode>nodeList) {
		this.nodeList = nodeList;
	}
	public void printGraph(WeightedNode node) {
		if(node.parent !=null) {
			printGraph(node.parent);
		}
		System.out.println(node.name);
	}
	
	void dijkstra(WeightedNode node) {
		PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
		node.distance = 0;
		queue.addAll(nodeList);
		while(!queue.isEmpty()) {
			WeightedNode currentNode = queue.remove();
			for(WeightedNode neightbour:currentNode.neighbours) {
				if(queue.contains(neightbour)) {
					if(neightbour.distance > currentNode.distance+currentNode.weightMap.get(neightbour)) {
						neightbour.distance = (currentNode.distance+currentNode.weightMap.get(neightbour));
						neightbour.parent = currentNode;
						queue.remove(neightbour);
						queue.add(neightbour);
					}
				}
			}
		}
		for(WeightedNode nodeToCheck:nodeList) {
			System.out.print("Node"+" "+nodeToCheck+"distance "+ nodeToCheck.distance +" , Path: ");
			printGraph(nodeToCheck);
			System.out.println();
		}
		
	}
	public void addWeightedEdge(int i, int j, int d) {
		WeightedNode first = nodeList.get(i);
		WeightedNode second = nodeList.get(j);
		first.weightMap.put(second, d);
	}

}
