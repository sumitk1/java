package com.interview;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Map {
	
	public static void main(String[] args) {
		HashMap<String, String> mm = new HashMap<String, String>();
		//HashMap mm = new HashMap();
		/*m.put("2", "22");
		m.put("asas","aaaa");
		*/
		Object o = new Object();
		
		mm.put("12", "1111");
		mm.put("1", "asasas");
		mm.put("4", "");
		//Iterator i = mm.Iterator();
		
		for(Object key: mm.keySet())
			System.out.println("mm - "+mm.get(key));
		System.out.printf("----- %d", mm.size());
		System.out.println(" ");
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("a","asas");
		ht.put("b","qqqq");
		ht.entrySet();
		Boolean b = ht.contains("asas");
		System.out.println("B ="+b);
		
		Enumeration<String> e = ht.elements();
		while(e.hasMoreElements())
			System.out.println("llll - "+ e.nextElement());
		
		Collection<String> c = mm.values();
		Iterator<String> i = c.iterator();
		while (i.hasNext()){
			System.out.println("mm ->"+i.next());
		}
		
		
	}
	
	
}
