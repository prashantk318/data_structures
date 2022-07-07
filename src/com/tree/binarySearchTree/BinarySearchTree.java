package com.tree.binarySearchTree;

public class BinarySearchTree {
	BinaryNode root;
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		this.root = null;
	}
	
	private BinaryNode inserBST(BinaryNode currentNode,int value) {
		if (currentNode ==null) {
			BinaryNode newNode = new BinaryNode();
			newNode.value = value;
			System.out.println("Node successfully inserted");
			return newNode;
		}else if(value <= currentNode.value) {
			currentNode.left = inserBST(currentNode.left, value);
			return currentNode;
		}else {
			currentNode.right = inserBST(currentNode.right, value);
			return currentNode;
			
		}
	}
	void insert(int value) {
		inserBST(root, value);
	}

}
