package interview.A;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		HashSet s = new HashSet(2);
		TreeSet tr = new TreeSet();
		
		tr.add(2);		tr.add(5);
		tr.add(1);		tr.add(23);
		tr.add(3);		tr.add(4);
		s.add(2);		s.add(5);
		s.add("7a");		s.add("qwqw");
		Collections.addAll(s , 77,66,55,44,33,22);
		
		Queue<String> qq = new PriorityQueue<String>();
		
		
		int[] aq = {1,2};
		Integer[] arr = new Integer[10];
		arr[0] = 0; arr[1] = 1;
		for(int i=2;i<10;i++){
			arr[i] = 5;
			if((i%2)==0)
				arr[i] = 0;
		}
		for(int x: arr)
			System.out.print("Arr = "+x);
		
		System.out.println("array len = "+aq.length);
		String sss = "asdf"; System.out.println("String len = "+sss.length());
		char[] a = sss.toCharArray(); //System.out.println("Char len = "+aa.length);
		s.add(aq);		s.add(2);		
		int ccc = 6;
		
		for(Object x: s){
		
			System.out.print(" "+x);
			
		}
		
	}
}
