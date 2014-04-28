package dataStructures;
public class FindStringType {

    public boolean isPalindrome (String str) {
        
        int start = 0;
        int end = str.length()-1;
        char[] stringArray = str.toCharArray();
        
        for (start=0; start < (str.length()/2); start++,end--) {
            if (stringArray[start] != stringArray[end]) {
                return false;
            }
        }
        return true;
    }
    
    
    public boolean isAnagram (String str1, String str2) {
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        int [] charCount = new int[256];
        
        for (char c1 : str1Array) {
            int index = (int)c1;
            charCount[index] ++;
        }
        for (char c2 : str2Array) {
            int index = (int)c2;
            if(--charCount[index] < 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main (String[] args) {
        FindStringType obj = new FindStringType();
        
        String str = "abcbaa";
        System.out.println("Palindrome = " + obj.isPalindrome(str));
        
        String str1 = "aabc";
        String str2 = "abaca";
        System.out.println("Anagram = " + obj.isAnagram(str1, str2));
        
    }
}