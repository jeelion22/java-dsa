package arrays;

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

}
