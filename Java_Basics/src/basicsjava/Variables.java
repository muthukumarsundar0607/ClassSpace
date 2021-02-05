package basicsjava;

public class Variables {

	/*
	 * Types of Variables 1# Class Level variable , 2# Method level or local
	 * variable 3# Static variable
	 * 
	 * Class level Variable - Variable should be inside the class but outside the
	 * method - It is access to all the method in the class ; () Method Variable or
	 * Local - Variable should be only inside the method body; -This is accessible
	 * to the particular method
	 */

	public int clrefa = 20;

	public void localmethodA() {
		int locrefa = 30;
		clrefa = locrefa + clrefa;
		System.out.println("My Class reference variable is " + clrefa);
	}

	public void localmethodB() {

		int locrefb = 40;
		locrefb = locrefb + clrefa;
		System.out.println("My Class reference variable is " + locrefb);
		clrefa = locrefb;

	}

	public void localmethodC() {
		System.out.println("My class reference variable is " + clrefa);

	}

	public static void main(String[] args) {

		Variables ref = new Variables();
		ref.localmethodA();
		ref.localmethodB();
		ref.localmethodC();

	}

}
