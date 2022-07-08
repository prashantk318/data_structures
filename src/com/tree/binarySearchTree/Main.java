package com.tree.binarySearchTree;

public class Main {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(70);
		tree.insert(50);
		tree.insert(90);
		tree.insert(30);
		tree.insert(60);
		tree.insert(80);
		tree.insert(100);
		tree.insert(20);
		tree.insert(40);
		tree.preOrder(tree.root);
		tree.inOrder(tree.root);
		tree.postOrder(tree.root);
		tree.levelOrder();
		tree.search(tree.root, 40);
	}

}
