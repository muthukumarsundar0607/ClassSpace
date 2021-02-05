package basicsjava;

public class ConstructorJava {

	/*
	 * public ConstructorJava(	) { System.out.println("Im in Constructor");
	 * 
	 * }
	 */

	/*
	 * private ConstructorJava() {
	 * 
	 * }
	 */

	/*
	 * protected ConstructorJava() {
	 * 
	 * }
	 */

	/*
	 * ConstructorJava() {
	 * 
	 * }
	 */
	
	public ConstructorJava(int a , int b) {
		System.out.println("im in Paramaterised Constructor and values "+a + " "+b);
	}

	public void MethodName() {
		System.out.println("Im just a Method");
	}

	public static void main(String[] args) {

		ConstructorJava ref = new ConstructorJava(20 ,30 );

	}

}
