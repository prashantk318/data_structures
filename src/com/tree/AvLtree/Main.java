package com.tree.AvLtree;

public class Main {
	public static void main(String[] args) {
		AVL avl = new AVL();
		//avl.preOrder(avl.root);
		avl.insert(5);
		avl.insert(10);
		avl.insert(15);
		avl.insert(20);
		avl.levelOrder();
		avl.delete(5);
		avl.levelOrder();
		avl.deleteAVL();
		
		
	}

}
