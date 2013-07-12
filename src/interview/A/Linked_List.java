package interview.A;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List {
	
	
	public static void main(String[] args) {

		LinkedList<String> ls = new LinkedList<String>();
		LinkedList<String> ls1 = new LinkedList<String>();

		ls.add("f");		ls.add("f");		ls.add("a");		ls.add("b");
		ls.add("d");		ls.add("c");		ls.add("x");		ls.add("j");
		ls.add("r");		ls.add("a");		ls.add("b");		ls.add("d");
		ls.add("c");		ls.add("x");		ls.add("j");		ls.add("r");
		 
		ls1 = ls;
		
		Iterator<String> ListIterator = ls.iterator();
		//ListIterator lt = ls.listIterator();
		
/*		for(ListIterator<String> i = ls.listIterator(); i.hasNext(); ) {
			  String item = i.next();
			  if(item.equals("f"))
				  i.add("xxxx");
			  System.out.print(" # "+item);
			}*/
		
		HashSet<String> hs = new HashSet<String>();
		while(ListIterator.hasNext()){
			String temp = ListIterator.next();
			hs.add(temp);
			System.out.print(" = "+temp);
		}			
		
		ls1.add("aaaaa");
		System.out.println(" ");
		System.out.println("ls1.equals(ls) - "+ls1.equals(ls));
		for(String s: ls1){
			System.out.print(" - "+s);
		}
		System.out.println("\n After removal of duplicates by adding in HashSet");
		for(String s: hs){
			System.out.print(" - "+s);
		}
		
		System.out.println(" Array copy");
		int[] a = {1,2,3,4,5,6,7,8};
		int[] b = a.clone();
		System.arraycopy(a, 6, a, 2, 2);
		for(int q: a)
			System.out.print(" "+q);
		
		System.out.println(" Char Array");
		char[] charArray = new char[] {'a', 'b', 'c'};
        String str = new String(charArray);
		System.out.println("String = "+str);
	}
	
	
}
