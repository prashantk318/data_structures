package com.pattern.decorator;

public class Main {
	public static void main(String[] args) {
		
		ChristmasTree tree = new ChristMasTreeImpl();
		TreeDecorator de = new BubbleLights(tree);
		String g = de.decorate();
		System.out.println(g);
}
}
