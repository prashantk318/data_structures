package com.tree.AvLtree;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
	BinaryNode root;
	
	public AVL() {
		// TODO Auto-generated constructor stub
		this.root = null;
	}
	
	public void preOrder(BinaryNode node) {
		if(node==null) {
			System.out.println("Binary AVL tree is empty");
			return;
		}
		System.out.print(node.value+" ");
		preOrder(node.left);
		preOrder(node.right);
		
	}
	public void postOrder(BinaryNode node) {
		if(node==null) {
			System.out.println("Binary AVL tree is empty");
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value+" ");
		
	}
	public void inOrder(BinaryNode node) {
		if(node==null) {
			System.out.println("Binary AVL tree is empty");
			return;
		}
		inOrder(node.left);
		System.out.print(node.value+" ");
		inOrder(node.right);	
	}
	public void levelOrder() {
		Queue<BinaryNode>queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
		BinaryNode node = queue.remove();
		System.out.println("node value is"+node.value+" ");
		if(node.left !=null) {
			queue.add(node.left);
		}
		if(node.right !=null) {
			queue.add(node.right);
		}
		}
	}
	
	BinaryNode searchNode(BinaryNode root, int value) {
		if(root==null) {
			System.out.println("AVL is empty,value not found"+root.value);
			return null;
		}else if(root.value ==value) {
			System.out.println("value found"+value+"in the BST");
			return root;
		}
		else if(value<root.value) {
			root.left = searchNode(root.left, value);
			return root.left;
		}
		else {
			root.right = searchNode(root.right, value);
			return root.right;
		}
	}
}
