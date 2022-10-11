package com.pattern.decorator;

public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;
    
    public TreeDecorator(ChristmasTree tree) {
		// TODO Auto-generated constructor stub
    	this.tree = tree;
	}

	// standard constructors
    @Override
    public String decorate() {
        return tree.decorate();
    }
}
