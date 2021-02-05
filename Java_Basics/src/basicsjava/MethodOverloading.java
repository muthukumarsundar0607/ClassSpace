package basicsjava;

public abstract class MethodOverloading {

	/* In java we cannot have same method name with same or no argruments */

	/*	
	 * Method Overloading occurs in the same Class Method Overloading - 1# Same MethodName with Different Number of Arguments 2#  Same method Name with Different Type of Argument 3# Same method Name with Different sequence of Argument
	 * 
	 * Overloading Can be done : public private protected default - can be overload
	 * in the same class static final abstract - Can be overload in the same class
	 */

	public static void methodA(int a) {
	a= 50;
	int b =0;
	int c =a/b;

	}

	private static int methodA(int a, int b) {

		int a1 = 20;
		return a1;

	}

	protected final void methodA(int a, float b) {

	}

	protected final void methodA(float b, int a) {

	}

	void methodA(float c, int b, int a) {

	}

	void methodA(float c, float b, int a) {

	}

	public abstract void methodB();

	public abstract void methodB(int a, int b);

	public static void main(String[] args) {

	}

}
