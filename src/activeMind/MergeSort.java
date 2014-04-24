package activeMind;

public class MergeSort {

	public static int[] merge(int[] arrayA, int[] arrayB) {

		// This is the new array which will contain all the elements from arrayA & arrayB
	    int[] result = new int[arrayA.length + arrayB.length];  
	    
	    /*
	     *  Counters
	     *  i - arrayA
	     *  j - arrayB
	     *  k - resultArray 
	     */
	    int i = 0, j = 0, k = 0;

	    while (i < arrayA.length && j < arrayB.length)
	    {
	    	// Loop through all the elements
	    	if (arrayA[i] < arrayB[j])       
	            result[k++] = arrayA[i++];

	        else        
	            result[k++] = arrayB[j++]; 
	    }

	    while (i < arrayA.length) {
	    	result[k++] = arrayA[i++];
	    }
	    while (j < arrayB.length) {
	    	result[k++] = arrayB[j++];
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		
		//{1,4,7,12,31,56,82,99} and {3,5,11,16,21,45,50,108}  
		
		int[] arrayA = {1,4,7,12,31,56,82,99};
		int[] arrayB = {3,5,11,16,21,45,50,108};
		
		int [] result = MergeSort.merge(arrayA, arrayB);
		
		for(int i : result ) {
			System.out.println(i);
		}		
	}
	
}
