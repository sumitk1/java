package com.interview;

import java.util.Random;

public class TestNode{
	public static void main(String[] args){


		Node start = new Node(100);
		Random generator = new Random(1212344);
		Node p = start;
		for(int i=1; i<10; i++){
			/*Node temp = new Node(i*generator.nextInt(49));
			temp.next = null;
			p.next = temp;*/
			p = p.next = new Node(i);
		}
		start.printList(start);
		
		/*System.out.println("Insert end");
		start.insertNodeAtEnd(start, 1);
		start.printList(start);
		
		System.out.println("Insert begin");
		start = start.insertAtBeginning(start, 777);
		start.printList(start);*/
		
		/*System.out.println("Insert after");
		start.insertAfter(start, 7, 666);
		start.printList(start);
		
		System.out.println("Delete from end");
		start.deleteFromEnd(start);
		start.printList(start);	*/	
		
		System.out.println("Sublist");
		Node x;
		try {
			x = start.sublist(start, 3, 6);
			start.printList(x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Please enter correct inputs ");
			e.printStackTrace();
		}
		//Node k = start;
		System.out.println("Reverse --");
		Node k = start.reverseList(start);
		start.printList(k);	
		
		System.out.println("Del--");
		start = start.deleteFromBeginning(k);
		start.printList(start);
		
		/*while(start.next != null){
			rev = insertAtBeginning(start.data, rev);
			start = start.next;
		}
		*/
		
	}


}

