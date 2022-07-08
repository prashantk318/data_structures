package com.tree.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

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
		root = inserBST(root, value);
	}
	public void preOrder(BinaryNode node) {
		if(node == null) {
			return;
			
		}
		System.out.print(node.value+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void inOrder(BinaryNode node) {
		if(node == null) {
			return;
			
		}
		
		inOrder(node.left);
		System.out.print(node.value+" ");
		inOrder(node.right);
	}
	public void postOrder(BinaryNode node) {
		if(node == null) {
			return;
			
		}
		
		System.out.print(node.value+" ");
		postOrder(node.right);
		postOrder(node.left);
	}
	
	public void levelOrder() {
		Queue<BinaryNode>queue = new LinkedList<BinaryNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode node = queue.remove();
			System.out.println(node.value+"");
		if(node.left !=null) {
			queue.add(node.left);
		}
		if(node.right !=null) {
			queue.add(node.right);
		}}
	}
	
	BinaryNode search(BinaryNode node, int value) {
		if(node==null) {
			System.out.println("value of"+value+"does not found");
			return null;
		}else if (node.value == value) {
			System.out.println("value of"+value+" found");
			return node;
		}else if(value<node.value) {
			return search(node.left, value);
		}else {
			return search(node.right, value);
		}
	}
	
	public static BinaryNode minimumNode(BinaryNode root) {
		if(root.left == null) {
			return root;
		}else {
			return minimumNode(root.left);
		}
	}
	
	public BinaryNode deleteNode(BinaryNode root, int value) {
		if(root == null) {
			System.out.println("value not found in Binary tree");
			return null;
		}
		if(value<root.value) {
			root.left = deleteNode( root.left, value);
		}else if (value>root.value){
			root.right = deleteNode( root.right, value);
		}else {
			if(root.left !=null && root.right !=null) {
				BinaryNode temp = root;
				BinaryNode minright = minimumNode(temp.right);
				root.value = minright.value;
				root.right = deleteNode(root.right, minright.value);
			}else if(root.left !=null) {
				root = root.left;
			}else if(root.right !=null) {
				root = root.right;
			}else {
				root = null;
			}
		}
		return root;
	}
}
