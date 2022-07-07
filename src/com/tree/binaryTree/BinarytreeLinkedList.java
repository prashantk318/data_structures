package com.tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarytreeLinkedList {
	BinaryNode root;
	public BinarytreeLinkedList() {
		this.root = null;
	}
	
	public void preOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		System.out.println(node.value+ " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void inOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
	
		inOrder(node.left);
		System.out.println(node.value + " ");
		inOrder(node.right);
	}
	public void postOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.value + " ");
	}
	void levelOrder() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print(presentNode.value);
			System.out.print("->");
			if(presentNode.left !=null) {
				queue.add(presentNode.left);
			}
			if(presentNode.right !=null) {
				queue.add(presentNode.right);
			}
			
		}
	}
	
  public void searchTree(String value) {
	  Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
	  queue.add(root);
	  while(!queue.isEmpty()) {
		  BinaryNode presentNode = queue.remove();
		  if(presentNode.value == value) {
			  System.out.println("the Value is"+" "+value+" "+"is found in tree");
			  return;
		  }else {
			  if(presentNode.left !=null) {
					queue.add(presentNode.left);
				}
				if(presentNode.right !=null) {
					queue.add(presentNode.right);
				}
		  }
	  }
	  System.out.println("the Value is"+" "+value+" "+"is not found in tree");
  }
  
  public void insert(String value) {
	  BinaryNode node = new BinaryNode();
	  node.value = value;
	  if(root==null) {
		  root = node;
		  System.out.println("inserted new node at root");
		  return;
	  }
	  Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
	  queue.add(root);
	  while(!queue.isEmpty()) {
		  BinaryNode presentNode = queue.remove();
		  if(presentNode.left == null) {
			  presentNode.left = node;
				
				System.out.println("inserted new node at left");
				break;
			}
		  else if (presentNode.right ==null) {
			  presentNode.right = node;
				System.out.println("inserted new node at right");
				break;
			}else {
				queue.add(presentNode.left);
				queue.add(presentNode.right);
			}
	  }
  }


}
