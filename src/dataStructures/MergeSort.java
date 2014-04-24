package dataStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MergeSort {

	public static void main(String[] args) {
		
		LinkedList<String> deals1= new LinkedList<String>();
		ArrayList<String> deals2= new ArrayList<String>();
		ArrayList<String> deals3= new ArrayList<String>();
		
		deals1.add("C");
		deals1.add("G");
		deals1.add("I");
		deals1.add("L");
		deals1.add("X");
		deals1.add("M");
		
		deals2.add("B");
		deals2.add("D");
		deals2.add("H");
		deals2.add("I");
		deals2.add("J");
		deals2.add("K");
		deals2.add("L");
		deals2.add("P");
		
		
		
		Iterator<String> itr1 = deals1.iterator();
		Iterator<String> itr2 = deals2.iterator();
		
		String a = itr1.next();
		String b = itr1.next();
		//String c = itr1.
		
		
		
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		
		
		//String deal1 = itr1.next();
		//String deal2 = itr2.next();
		
		while (itr1.hasNext()) {
			String deal1 = itr1.next();
			
			while (itr2.hasNext()) {
				String deal2 = itr2.next(); 
				int count = 0;
				if (deal1.compareTo(deal2) == 0) {
					
					int index1 = deals1.indexOf(deal1);
					int index2 = deals2.indexOf(deal2);
					deals3.addAll(deals1.subList(0, index1));
					
					
					Iterator<String> itr1A = deals1.iterator();
					Iterator<String> itr2A = deals2.iterator();
						
					//deals3.a
					count++;
				}
			}
			
		}
		
		
	}
	
}
