package dataStructures;

public class Arrays {
	
	public int maxSum (int[] arr) {
		
		int i = 0;
		int maxSum = 0;
		int currentSum = 0;
		
		for (i=0; i< arr.length; i++) {
			
			currentSum += arr[i];
			
			if (currentSum < 0) {
				currentSum = 0;
				
			}
			if (maxSum < currentSum) {
				maxSum = currentSum;
			}
			
		}
		return maxSum;
		
	}
		
	public static void main(String[] args) {
		
		int[] input= {-1, 11, -1, 13, -5, -2};
		
		Arrays obj = new Arrays();
		int ret = obj.maxSum(input);
		System.out.println(ret);
	}
	

}
