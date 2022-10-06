package com.LinkedList.Problems;

public class LinkedListCycle {
	public static void main(String[] args) {
		
	}
	
	public boolean linkedlistCycle(Node head){
		if(head==null || head.next==null) {
			return false;
		}
		
		Node p1 = head;
		Node p2 = head.next;
		while(p1!=p2) {
			if(p2==null || p2.next == null) {
				return false;
			}
			p1 = p1.next;
			p2 = p2.next.next;
		}
		
		return true;
		
	}

}
