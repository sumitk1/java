package com.interview;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Random;

/**
 *	Linked List implementation of the list
 *
 *
 */
class Node{

	protected int data;
	Node next;
	
	public Node(int d){
		this.data = d;
		//this.next = null;
	}
	public Node(){
		
	}
	public Node(int d, Node next){
		this.data = d;
		this.next = next;
	}

	public void insertNodeAtEnd(Node start, int data){
		if(start==null){
			start= new Node(data, start);
		}
		Node p = start;
		while(p.next != null){
			p = p.next;
		}
		p.next = new Node(data, p.next);
	}
	
	public Node insertAtBeginning(Node start, int data){
		start = new Node(data, start);
		return start;
	}
	public Node reverseList(Node start){
		if(start == null)
			return null;
		if(start.next == null)
			return new Node(start.data);

		Node rev = new Node(start.data);
		while( start.next != null){
			rev = insertAtBeginning(rev, start.next.data);
			start = start.next;
		}
		//rev = insertAtBeginning(rev, start.data);
		return rev;
	}
	public void insertAfter(Node start, int after, int data){
		Node p = start;
		while(p.data != after)
			p = p.next;
		p.next = new Node(data, p.next);
	}
	
	public void deleteFromEnd(Node start){
		while(start.next.next != null){
			start = start.next;
		}
		start.next = null;
	}
	public Node deleteFromBeginning(Node start){
		if(start == null)
			throw new UnsupportedOperationException();
		
		if (start.next == null)
			start = null;
		
		start = start.next;
		return start;
	}	
	
	public Node sublist(Node start, int p, int q){
		if(start == null)
			return null;
		if( p > q )
			throw new IllegalArgumentException();
		else if (p==q)
			return null;
		for(int i=0; i<p; i++)
			start = start.next;
			
		Node sub = new Node(start.data);
		Node sub_start = sub;
		for(int c=p+1; c<q; c++){
			if(start.next == null)
				throw new NullPointerException();
			sub.next = new Node(start.next.data);
			sub = sub.next;
			start=start.next;
		}
		return sub_start;
	}
	
	public void printList(Node start){
		
		while(start.next != null){
			System.out.print(" "+start.data+" -->");
			start = start.next;
		}
		System.out.println(" "+start.data+ " END LIST");
	}
}
