package programming_basics;

public final class DivibleBy5_10_15 {
	
	 final int myvar= 25; 
	
	public void scenarioOne() {
		
 
		int mynum = 450;
		if (mynum % 5 == 0) {
			if (mynum % 10 == 0) {
				if (mynum % 15 == 0) {
					System.out.println("Print my number is divisble ");
				}
			}
		} else {
			System.out.println("print not divisble");

		}
		
	}
	
	
	public  final void scenarioTwo() {
		int mynum=450;
		if (mynum %5 ==0 && mynum%10==0 && mynum%15==0) {
			System.out.println("Print my number is divisble ");
		}
		else {
			System.out.println("print not divisble");
		}
	}

	public static void main(String[] args) {

		/*
		 * Algorithim declare a number , mynum=450 check condition check 450%5==0 , if
		 * false ,print not divisble true , check 450%10==0 , if false print notivisble
		 * true,check 450%15==0, if false print notivisble
		 */

	}
}
