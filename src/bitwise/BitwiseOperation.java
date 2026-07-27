package bitwise;
import java.util.*;


public class BitwiseOperation {
	

	
//	the array should contain only one element odd counted and every other elements even counted
	public int getOddOccurrence(ArrayList<Integer> arr) {
		int res = 0 ;
		
		for (int i = 0 ; i < arr.size() ; i++) {
			
//			1 ^ 1 = 0
//			0 ^ 0 = 0
//			1 ^ 0 = 1
			
			res ^= arr.get(i);
			
		}
		
		return res;
	}
	
}
