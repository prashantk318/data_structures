package com.tree;

public class Main {
	public static void main(String[] args) {
		TreeNode node = new TreeNode("drinks");
		TreeNode hot = new TreeNode("Hot");
		TreeNode cold = new TreeNode("Cold");
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("coffee");
		TreeNode wine = new TreeNode("wine");
		TreeNode beer = new TreeNode("beer");
		node.addChild(hot);
		node.addChild(cold);
		hot.addChild(tea);
		hot.addChild(coffee);
		cold.addChild(wine);
		cold.addChild(beer);
		System.out.println(node.print(0));
		
	}

}
