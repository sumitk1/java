import java.lang.reflect.Array;
import java.util.*;

public class LexicographicalBigger {
    public static void main(String[] args) {

        String input = "dkhc";

        int firstMin = 0;
        int firstMax = 0;

        for (int i=input.length()-1; i>0; i--) {
            if (input.charAt(i-1) < input.charAt(i)) {
                firstMin = i;
            }
        }

        for (int j=input.length()-1; j>firstMin; j--) {
            if (input.charAt(firstMin-1) < input.charAt(j)) {
                firstMax = j;
            }
        }

        char[] str = input.toCharArray();
        char temp = str[firstMin-1];
        str[firstMin-1] = str[firstMax];
        str[firstMax] = temp;

        String preSorted = new String(str).substring(0, firstMin);
        char[] toSort = new String(str).substring(firstMin, str.length).toCharArray();
        Arrays.sort(toSort);
        String sorted = new String(toSort);
        System.out.println("new=" + new String(str) + firstMin +" pre="+ preSorted + " to=" + toSort);
        System.out.println(preSorted + sorted);

        Queue queueA = new LinkedList();

        queueA.add("element 3");
        queueA.add("element 1");
        queueA.add("element 2");

        //access via Iterator
        Iterator iterator = queueA.iterator();
        while(iterator.hasNext()){
            String element = (String) iterator.next();
            System.out.println(element);
        }

        //access via new for-loop
        for(Object object : queueA) {
            String element = (String) object;
            System.out.println(element);
        }
    }
}
