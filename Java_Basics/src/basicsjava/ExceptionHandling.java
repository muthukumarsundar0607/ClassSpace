package basicsjava;

public class ExceptionHandling {

	public void tryFinallyBloack() {
		try {
			int a = 90;
			int b = 0;
			int c = a / b;
		} finally {
			System.out.println("Method C- This is my finally block");
		}

	}

	public void runTime() {

		throw new NullPointerException();

		

	}

	public void tryCatchFinally() {
		try {
			int srini[] = new int[8];
			srini[0] = 20;
			srini[1] = 45;
			srini[2] = 76;

			for (int i = 4; i < srini.length; i++) {
				srini[i] = 89;
			}

			System.out.println("Method A executing after Method C");

			for (int a : srini) {
				System.out.println(a);
			}

		} catch (IllegalStateException e) {
			e.printStackTrace();

		} finally {

			System.out.println(" Method A : My Code flow in Finally");

		}
	}

	public void nestedTryCatchFinally() {
		try {
			System.out.println("Karthick");

			try {
				System.out.println("Naren");
			} catch (Exception r) {
				System.out.println("Nattu");
			}

		} catch (Exception e) {

		} finally {

		}
	}

	public void tryMultipleCatch() {

		try {
			System.out.println("Muthukumaran");
			throw new ArithmeticException();
		}

		catch (ArithmeticException e) {

		}

		catch (Exception e) {

		}

	}

	public void methodD() throws ArithmeticException, IllegalArgumentException, IllegalStateException {

		System.out.println("Muthukumaran");

	}

	public static void main(String[] args) {

		ExceptionHandling ref = new ExceptionHandling();

		ref.runTime();

	}

}
