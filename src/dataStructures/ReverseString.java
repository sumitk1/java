package dataStructures;
public class ReverseString {

	/**
	 * This function will reverse the string in place
	 * 
	 * @param str - String to reerse
	 * @return reversed string
	 */
    public String reverse (String str) {
    
        int start = 0;
        int end = str.length()-1;
        char[] stringArray = str.toCharArray();
        
        for (int i=start; i < (str.length()/2); i++) {
            
            char temp = stringArray[i];
            stringArray[i] = stringArray[end];
            stringArray[end] = temp;
            end--;    
        }
        
        String ret = new String (stringArray);
        return ret;
    }

    /**
     * This function reverse each word in a string
     *  
     * @param str
     * @return
     */
    public String reverseWord (String str) {
        
        String ret = "";
        String word = "";
        int i =0;
        while (i < str.length()) {
            char c = str.charAt(i);
            
            if (c == ' ') {
                ret = ret + word + " ";
                word = "";
            } else {
                word = c + word;    
            }
            
            i++;
        } 
        return ret + word; // for last word
    }
    public static void main (String[] args) {
    
        String toReverse = "I am a human being";
        System.out.println(toReverse);
        
        ReverseString obj = new ReverseString();
        
        String ret1 = obj.reverse(toReverse);
        
        System.out.println(ret1);
        
        String ret2 = obj.reverseWord (ret1);
        
        System.out.println(ret2);
        
    }

}