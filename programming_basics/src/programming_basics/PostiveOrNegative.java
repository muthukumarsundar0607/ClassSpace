package programming_basics;

public class PostiveOrNegative {
	
	/*declare number mynum
	 * check condition mynum==0 ,mynum<0,mynum>0
	 * ==0 ,print either negative nor positve 
	 * <0 , print negative 
	 * >0 , print positive  */

	public static void main(String[] args) {
	 int mynum = 0;
	 if (mynum==0) 
	 {
		 System.out.println(mynum+" print either negative nor positve");
	 }else if (mynum<0) {
		 System.out.println(mynum+" print negative");
	 } else if (mynum>0) {
		 System.out.println(mynum+" print positive");
	 }

	}

}
