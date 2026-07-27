package arrays;

public class ArrayRunner {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		
		ArrayBasics basics = new ArrayBasics();
		
		basics.printArray(numbers);
		
		System.out.println("Sum = " + basics.sum(numbers));
		
		System.out.println("Maximum = " + basics.findMax(numbers));

	}

}
