package interview.A;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;

public class List {
	
	int i;
	public List(int z){
		this.i=z;
	}
	
	public String toString(){
		return "int = "+this.i;
	}
	
	public static void main(String[] args) {
		ArrayList<List> mylist = new ArrayList<List>();
		ArrayList<Integer> in = new ArrayList<Integer>();
		ArrayList al = new ArrayList();
		
		//ArrayList l = (ArrayList)Collections.synchronizedList(al);
		
/*		Properties p = new Properties();
		try {
			p.load(new FileInputStream("C:/filename.properties"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		//ArrayList al = new ArrayList();
		al.add("asas");		al.add(2);
		System.out.println(al.get(1));		System.out.println("AA");
		
		
		List s = new List(2778787);		mylist.add(new List(1));
		mylist.add(s);		System.out.println(mylist);
		
		in.add(1212);		in.add(1111);
		in.add(1212);		in.add(1111);
		in.add(1212);		in.add(777);
		in.remove((Integer)777);
		Integer inn = Collections.max(in);  // Maximum
		System.out.println("O = "+inn);
		
		System.out.println(in);
		Object[] o = in.toArray();
		Integer[] x = new Integer[3];
		x = in.toArray(x);
		//Arrays.sort(x);
		for(Integer i: x)
			System.out.print(i+"_");
	}
}
