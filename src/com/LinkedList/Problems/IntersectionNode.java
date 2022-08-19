package com.LinkedList.Problems;

public class IntersectionNode {

	public Node getIntersetionNode(Node headA, Node headB) {
		Node endA = headA;
		while(endA.next !=null) {
			endA = endA.next;
		}
		
		endA.next = headB;
		Node start = null;
		Node slow = headA;
		Node fast = headA;
		
		while(fast !=null && fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				start = headA;
				while(start !=slow) {
					start = start.next;
					slow = slow.next;
				}
				break;
			}
		}
		
		endA.next = null;
		return start;
	}
}
