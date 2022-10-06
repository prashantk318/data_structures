package com.LinkedList.Problems;

public class ReverseList {
public Node reverseList(Node head) {
	if(head == null || head.next == null) {
		return head;
	}
	
	Node currentNode = head;
	Node prev = null;
	while(currentNode !=null) {
		Node temp = currentNode.next;
		currentNode.next = prev;
		prev = currentNode;
		currentNode = temp;
	}
	return prev;
}
}
