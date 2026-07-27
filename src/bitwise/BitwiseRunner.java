package bitwise;

import java.util.ArrayList;
import java.util.Arrays;

public class BitwiseRunner {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 2, 2));
		
		BitwiseOperation bitwiseOp = new BitwiseOperation();
		
		int oddOcurrence = bitwiseOp.getOddOccurrence(arr); 
		
		System.out.println(oddOcurrence);
		
		System.out.println(bitwiseOp.isPowerOfTwo(4));
		System.out.println(bitwiseOp.isPowerOfTwo(18));
		System.out.println(bitwiseOp.isPowerOfTwo(32));

	}

}
