package basicsjava;

public class SwitchCase {

	public void methodswitchcase() {	

		int a = 30;
		int b = 40;
		int c = 30 + 40;

		switch (c) /// Expected value

		{

		case 70:
			int g = 10 + c;
			System.out.println("my Value is " + g);
		
		case 10: // Actual Value
			int d = 30 + c;
			System.out.println("my Value is " + d);
			
		case 20: // Actual value defined

			int e = 40 + c;
			System.out.println("my Value is " + e);
			break;
		case 40: // Actual value defined

			int f = 50 + c;
			System.out.println("my Value is " + f);
			break;
			
			default :
				System.out.println("No Value has been Matched");
		}
	}

	public static void main(String[] args) {

		SwitchCase object = new SwitchCase();
		object.methodswitchcase();

	}

}
