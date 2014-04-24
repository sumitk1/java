package activeMind;

/**
 * Class for merging two sorted arrays
 * 
 * @author sumit
 *
 */
public class MergeSort {

	/**
	 * This function takes in two arrays and merge them together in sorted order.
	 * The assumption is that both the arrays are sorted
	 * 
	 * @param arrayA - a sorted array if integers
	 * @param arrayB - a sorted array if integers
	 * 
	 * @return
	 */
	public int[] merge(int[] arrayA, int[] arrayB) {

		 if (arrayA != null && arrayB != null){
			 
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
	
		    // Since all the elements of arrayB is done comparing, put all the 
		    // remaining elements of arrayA at the end of the result
		    while (i < arrayA.length) {
		    	result[k++] = arrayA[i++];
		    }
		    
		    // Since all the elements of arrayA is done comparing, put all the 
		    // remaining elements of arrayB at the end of the result
		    while (j < arrayB.length) {
		    	result[k++] = arrayB[j++];
		    }
		    
		    return result;
		    
	    } else {
	    	System.out.println("Arrays are empty");
	    	int[] result = {-1};
	    	return result;
	    }
	    
	}
	
	public static void main(String[] args) {
		
		//{1,4,7,12,31,56,82,99} and {3,5,11,16,21,45,50,108}  
		
		int[] arrayA = {1,4,7,12,31,56,82,99};
		int[] arrayB = {3,5,11,16,21,45,50,108};
		
		MergeSort mergeSort = new MergeSort();
		int [] result = mergeSort.merge(arrayA, arrayB);
		
		for(int i : result ) {
			System.out.print(i);
		}		
	}
	
}
