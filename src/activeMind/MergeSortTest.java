/**
 * 
 */
package activeMind;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author sumit
 *
 */
public class MergeSortTest {

	private MergeSort mergeSort = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		mergeSort = new MergeSort();
		
	}

	/**
	 * Test method for {@link activeMind.MergeSort#merge(int[], int[])}.
	 */
	@Test
	public void testNullArrays() {

		int[] arrayA = null;
		int[] arrayB = null;
		int[] result = mergeSort.merge(arrayA, arrayB);
		
		assertTrue(result[0] == -1);
		
	}
	
	/**
	 * Test method for {@link activeMind.MergeSort#merge(int[], int[])}.
	 */
	@Test
	public void testMerge() {

		int[] arrayA = {1,4,7,12,31,56,82,99};
		int[] arrayB = {3,5,11,16,21,45,50,108};
		int[] expectedResult = {1,3,4,5,7,11,12,16,21,31,45,50,56,82,99,108};
		
		int[] result = mergeSort.merge(arrayA, arrayB);
		
		assertArrayEquals(expectedResult, result);
		
	}
	
	

}
