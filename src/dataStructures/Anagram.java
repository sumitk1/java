package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {

	private String str1 = new String();
	private String str2 = new String();
	
	public static void main(String[] args) {
	
		Anagram obj = new Anagram();
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 1st String :");
			obj.str1 = input.readLine();
			System.out.println("Enter 2nd String :");
			obj.str2 = input.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(obj.isAnagram(obj.str1, obj.str2))		
			System.out.println(" The strings are Anagram");
		else
			System.out.println(" The strings are not an Anagram");
		int x=010;
		System.out.println("x ="+x);

	}
	
	public boolean isAnagram(String s, String t){
		if(s.length() != t.length())
			return false;
		if(s.equals(t))
			return true;
		
		int[] a1 = new int[256];
		int[] a2 = new int[256];
		for(int i=0;i<a1.length;i++)
			a1[i]=1;
		
		for(int i=0;i<a2.length;i++)
			a2[i]=1;
		
		if(a1.equals(a2))
			System.out.println("sumit");
		
		for(int i=0; i<s.length();i++){
			//System.out.println("Char at a1["+i+"] = "+s.charAt(i));
			a1[s.charAt(i)] += 1 ;
			a2[t.charAt(i)] += 1 ;
			//System.out.println("Char at a2["+i+"] = "+t.charAt(i));
				
		}
		for(int i : a1)
			System.out.print(i+"_");
		System.out.println(" ");
		for(int i : a2)
			System.out.print(i+"_");
		
		int count=0;
		for(int i=0;i<a2.length;i++){
			if(a1[i] == a2[i])
				count++;
			else
				return false;
		}
		
		if (count==a2.length)
			return true;
		
		
		
		return false;
		
	}
	
}
