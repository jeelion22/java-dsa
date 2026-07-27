package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRunner {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		
		ArrayBasics basics = new ArrayBasics();
		
		basics.printArray(numbers);
		
		System.out.println("Sum = " + basics.sum(numbers));
		
		System.out.println("Maximum = " + basics.findMax(numbers));
		
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1,2 ,3, 4,5, 5));
		
		int n = arr.size();
		
		
		System.out.println("Odd count num = " + basics.getOddOccurrence(arr, n));

	}

}
