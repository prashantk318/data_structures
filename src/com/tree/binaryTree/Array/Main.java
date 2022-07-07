package com.tree.binaryTree.Array;

public class Main {
	public static void main(String[] args) {
		BinaryTree arr = new BinaryTree(9);
		arr.insert("N1");
		arr.insert("N2");
		arr.insert("N3");
		arr.insert("N4");
		arr.insert("N5");
		arr.insert("N6");
		arr.insert("N7");
		arr.insert("N8");
		arr.insert("N9");
		System.out.println();
		arr.preOrder(1);
		System.out.println("after PreOrder");
		arr.inOrder(1);
		System.out.println("after inOrder");
		arr.postOrder(1);
		System.out.println("after post Order");
		arr.levelOrder();
		int l = arr.searchTree("N9");
		System.out.println(l);
		arr.delete("N5");
				arr.levelOrder();
				arr.DeleteBT();
		
	}

}
