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
	
public int getHeight(BinaryNode node) {
	if(node == null) {
		return 0;
	}
	return node.height;
}

private BinaryNode rotateRight(BinaryNode disBalancedNode) {
	BinaryNode newNode = disBalancedNode.left;
	disBalancedNode.left = disBalancedNode.left.right;
	newNode.right = disBalancedNode;
	disBalancedNode.height = 1+ Math.max(getHeight(disBalancedNode.left), getHeight(disBalancedNode.right));
	newNode.height = 1+ Math.max(getHeight(newNode.left), getHeight(newNode.right));
	return newNode;
}

private BinaryNode rotateLeft(BinaryNode disBalancedNode) {
	BinaryNode newNode = disBalancedNode.right;
	disBalancedNode.right = disBalancedNode.right.left;
	newNode.left = disBalancedNode;
	disBalancedNode.height = 1+ Math.max(getHeight(disBalancedNode.left), getHeight(disBalancedNode.right));
	newNode.height = 1+ Math.max(getHeight(newNode.left), getHeight(newNode.right));
	return newNode;
}

public int getBalance(BinaryNode node) {
	if(node==null) {
		return 0;
	}
	return getHeight(node.left) - getHeight(node.right);
}

private BinaryNode insertNode(BinaryNode node, int value) {
	if(node==null) {
		BinaryNode newNode = new BinaryNode();
 		newNode.value = value;
		newNode.height = 1;
		return newNode;
	}else if(value<node.value) {
		node.left = insertNode(node.left, value);
	}else {
		node.right = insertNode(node.right, value);
	}
	node.height = 1+ Math.max(getHeight(node.left), getHeight(node.right));
	int balance = getBalance(node);
	if(balance > 1 && value<node.left.value) {
		return rotateRight(node);
	}
	if(balance > 1 && value>node.left.value) {
		node.left = rotateLeft(node.left);
		return rotateRight(node);
	}
	if(balance < -1 && value > node.right.value) {
		return rotateLeft(node);
	}
	if(balance <-1 && value<node.right.value) {
		node.right = rotateRight(node.right);
		return rotateLeft(node);
		
	}
	return node;
}

public void insert(int value) {
	root = insertNode(root, value);
}

public static BinaryNode minimumnode(BinaryNode node) {
	if(node.left==null) {
		return node;
	}
	else {
		return minimumnode(node.left);
	}
}

public BinaryNode deleteNode(BinaryNode node, int value) {
	if(node ==null) {
		System.out.println("value not found");
		return null;
	}
	if(value<node.value) {
		node.left = deleteNode(node.left, value);
	}else if(value>node.value) {
		node.right = deleteNode(node.right, value);
	}else {
		if(node.left !=null && node.right !=null) {
			BinaryNode temp = node;
			BinaryNode minNode = minimumnode(temp.right);
			node.value = minNode.value;
			node.right = deleteNode(minNode.right, minNode.value);
		}else if (node.left !=null) {
			node = node.left;
		}else if (node.right !=null) {
			node = node.right;
		}else {
			node = null;
		}
	}
	int balance = getBalance(node);
	if(balance>1 && getBalance(node.left)>=0) {
		return rotateRight(node);
	}
	if(balance>1 && getBalance(node.left)<0) {
		node.left = rotateLeft(node.left);
		return rotateRight(node);
	}
	if(balance<-1 && getBalance(node.right)<=0) {
		return rotateLeft(node);
	}
	if(balance<-1 && getBalance(node.right)>0) {
		node.right = rotateRight(node.right);
		return rotateLeft(node);
	}
	return node;
}

public void delete(int value) {
	root =  deleteNode(root, value);
}

public void deleteAVL() {
	root = null;
	System.out.println("successfully deleted AVL");
	
}
}
