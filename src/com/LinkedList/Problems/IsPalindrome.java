package com.LinkedList.Problems;

public class IsPalindrome {
	
	public boolean ispalindrome(Node head) {
		if(head == null && head.next == null) {
			return true;
		}
		
		Node p1 = head;
		Node p2 = head;
		while(p2!=null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
		
		Node curr = head;
		Node temp = null;
		Node prev = null;
		//reverse Node
		while(curr !=p1) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		
		// odd number of elements, need left move p1 one step
        if (p2 != null && p2.next == null) p1 = p1.next;
        while(p1 !=null) {
        	if(p1.data !=prev.data) {
        		return false;
        	}
        	p1 = p1.next;
    		prev = prev.next;
        }
        
        return true;
	}

}
