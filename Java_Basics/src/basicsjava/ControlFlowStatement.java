package basicsjava;

public class ControlFlowStatement {

	public void whilemethod() {
		int a = 90;
		int b = 20;
		int c = a + b;
		while (c < 110) {
			System.out.println("please execute the loop  C is lessser than 100 and now c value is " + c);
			c++;
		}
		System.out.println("My C value is greated than 110 and Loop terminated ");
	}

	public void dowhile() {
		int a = 90;
		int b = 10;
		int c = a + b;
		do {
			System.out.println("please execute the loop ,  C is lessser than 110 and now c value is " + c);
			c++;
		} while (c < 110);

	}

	public void forloop() {
		int a = 90;
		int b = 20;
		for (int c = a + b; c < 110; c++) {
			System.out.println("please execute the loop  C is lessser than 100 and now c value is " + c);

		}

	}

	public void enchancedforloop() // applicable only for collections and arrays
	{
		int arr[] = { 89, 67, 56, 45, 34, 23, 12, 34, 55 };

		for (int arraypointer : arr) {
			int a = 20 - arraypointer;
			System.out.println("My Value of a after suntracting the value from arrayelements is " + a);

		}
	}

	public void nestedforloop() {
		int a = 90;
		int b = 20;
		for (int c = a + b; c < 112; c++) {
			if (c == 110) {
				continue;

			}

			for (int d = c + b; d <= 132; d++) {
				System.out.println("My d next 3 value for " + c + " is " + d);

			}

		}

	}

	public static void main(String[] args) {
		ControlFlowStatement ref = new ControlFlowStatement();
		/*
		 * ref.whilemethod(); ref.dowhile();
		 */
		ref.nestedforloop();

	}
	
	/* 
	 * Break - When ever occurs in the loop or switch , it will terminate the loop 
	 * Continue - When ever continue occurs in the loops , it  will skip the current iteration and continue to the next iteration
	 */

}
