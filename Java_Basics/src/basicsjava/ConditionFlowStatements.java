package basicsjava;

public class ConditionFlowStatements {

	public void ifmethod() {

		int a = 90;
		int b = 10;
		int c = a + b;
		if (c == 100) {
			System.out.println("Value is 100");
		}
		System.out.println("Value is not 100");
	}

	public void ifelsemethod() {
		int a = 90;
		int b = 10;
		int c = a + b;
		if (c == 100) {
			System.out.println("Value is 100");
		} else {
			System.out.println("Value is not 100");
		}

	}

	public void nestedif() {
		int a = 90;
		int b = 10;
		int c = a + b;
		if (c == 100) {
			System.out.println("Value is 100");
			int d = c - a;
			if (d == b) {
				System.out.println(" My b and d value are same ");
			}
		} else {
			System.out.println("My Value is not 100");
		}
	}

	public void ifelseif() {
		int a = 90;
		int b = 20;
		int c = a + b;
		if (c == 70) {
			System.out.println("My Value is 70");

		} else if (c == 80) {
			System.out.println("My Value is 80");

		} else if (c == 100) {
			System.out.println("My Value is 70");

		}

	}

	public void ifelseifpart2() {
		int a = 90;
		int b = 20;
		int c = a - b;
		if (c == 70) {
			System.out.println("My Value is 70");

		} else if (c == 80) {
			System.out.println("My Value is 80");

		} else if (c == 100) {
			System.out.println("My Value is 70");

		}

	}

	public void switchcasemethod() {
		int a = 90;
		int b = 10;
		int c = a + b;
		switch (c) {
		case 60:
			System.out.println("My Value is 60");
			break;
		case 70:
			System.out.println("My Value is 70");
			break;
		case 80:
			System.out.println("My Value is 80");
			break;
		case 90:
			System.out.println("My Value is 90");
			break;
		case 100:
			System.out.println("My Value is 100");
			break;
		default:
			System.out.println("Case not Matched");
		}

	}

	public static void main(String[] args) {
		ConditionFlowStatements ref = new ConditionFlowStatements();
		ref.ifmethod();

	}

}
