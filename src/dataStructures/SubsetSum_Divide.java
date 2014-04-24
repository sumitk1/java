package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;

public class SubsetSum_Divide {

	public Date today = new Date();
	
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number of elements");
			//String str = input.readLine();
			int num = Integer.parseInt(input.readLine());
			Random r;

			int[] a = new int[num];
			for (int i=0; i<num;i++){
				System.out.println("Enter element at pos "+i);
				a[i] = Integer.parseInt(input.readLine());
			}
			SubsetSum_Divide obj = new SubsetSum_Divide();
			//obj.maxSubsetSum(str);
			
		} catch (IOException e) {
			// Catch input exceptions
			e.printStackTrace();
		}
		
	}	
	
	public void maxSubsetSum(String str){
		
	}
}
