package com.LinkedList.Problems;

public class MiddleOfNode {
	 public Node middleNode(Node head) {
		 Node p1 = head;
		 Node p2 = head;
	        while (p2 != null && p2.next != null) {
	            p1 = p1.next;
	            p2 = p2.next.next;
	        }
	        return p1;
	    }
}
