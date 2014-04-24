package com.interview;
import java.util.LinkedList;


public class MergedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList <String> list1 = new LinkedList<String>();
		LinkedList <String> list2 = new LinkedList<String>();
		LinkedList <String> mergedList = new LinkedList<String>();
		
		
		list1.add("C");
		list1.add("G");
		list1.add("I");
		list1.add("L");
		list1.add("X");
		list1.add("M");
		
		list2.add("B");
		list2.add("D");
		list2.add("H");
		list2.add("I");
		list2.add("J");
		
		list2.add("K");
		list2.add("L");
		list2.add("P");
		
		int count1 = 0;
		int count2 = 0;
		for (String list1Results : list1) {
			for (String list2Results : list2) {
				if(list1Results.toString().equals(list2Results.toString())) {
					for(int i = 0; i < count1; i++) {
						mergedList.add(list1.get(i));
						//list1.remove(i);
					}
					for(int j = 0; j < count2; j++) {
						mergedList.add(list2.get(j));
						//list2.remove(j);
					}
					//mergedList.add(list1Results);
					count1 = 0;
					count2 = 0;
					
				} 
				count2++;
			}
			count1++;
			count2 = 0;
		}
		
		for (String mergeResult : mergedList) {
		System.out.println(mergeResult);
		}
	}

}
