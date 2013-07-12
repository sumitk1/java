package interview.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {


	public static void main(String[] args) {
		
		try {
			BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your string:");
			String str = Input.readLine();
			System.out.println(str);
			//System.out.println(isUniqueChars2(str)); 
			
			//System.out.println(checkDuplicate(str));
			char[] char_str = str.toCharArray();
			System.out.println("char length = "+char_str.length);
			removeDuplicates(char_str);
			System.out.println("mod char length = "+char_str.length);
			for (char c: char_str){
				System.out.println(c);
			}
			/*String s = "sumit kumar";
			int a[] = new int[10];
			System.out.println("Length = "+s.length());
			System.out.println("Array Length = "+a.length);
			*/
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//Remove duplicate
	public static void removeDuplicatesEff(char[] str) {
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;
		boolean[] hit = new boolean[256];
		for (int i = 0; i < 256; ++i) {
			hit[i] = false;
		}
		hit[str[0]] = true;
		int tail = 1;
		for (int i = 1; i < len; ++i) {
			if (!hit[str[i]]) {
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
		}
		str[tail] = 0;
	}

	//Remove duplicate
	public static void removeDuplicates(char[] str) {
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;

		int tail = 1;

		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j]) break;
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
		}
		str[tail] = 0;
	}

	// Bit vector
	public static boolean checkDuplicate(String str){
		int check = 0;
		
		for (int i =0; i<str.length();i++){
			int x=0;
			x=str.charAt(i)-'a';
			System.out.println("X = "+x);
			int y = 1 << x;
			System.out.println(" 1 << x = "+y);
			if((check & (1 << x))>0)
				return false;
			check = check | x;
		}
		return true;
	}
	
	// Check unique char in the string O(n)
	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println("Value at i = "+i +" is "+val);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
}
