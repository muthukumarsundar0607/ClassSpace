package programming_basics;

public class EvenOrOdd {

	/*
	 * 234%2 ==0 print even condition false , print odd
	 */

	public static void main(String[] args) {
		int a = 234;
		int b = a % 2;

		if (b == 0) {
			System.out.println(" even");
		} else {
			System.out.println(" odd");
		}

	}

}
