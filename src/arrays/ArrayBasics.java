package arrays;

import java.util.*;

public class ArrayBasics {
	
	public void printArray(int[] arr) {
		
		for (int num : arr) {
			System.out.print( num + " ");
		}
		
		System.out.println();
		
	}
	
	public int findMax(int[] arr) {
		int max = arr[0];
		
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		
		return max;
	}
	
	
	public int sum(int[] arr) {
		int sum = 0;
		
		for (int num : arr) {
			sum += num;
		}
		
		return sum;
	}
	
	
// find odd occurrence number in an array
	
	public int getOddOccurrence(ArrayList<Integer> arr, int n) {
		
		
		for (int i = 0; i < n; i++) {
			int count = 0 ;
			
			for (int j = 0; j < n; j++) {
				if (arr.get(i).equals(arr.get(j))) {
					count++;
				}
			}
			
			if (count % 2 !=0) {
				return arr.get(i);
			}
		}
		
		return -1;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
