package programming_basics;

public class DivisbilbeBy5 {
	
	/*Algorthim
	 * declare two numbers 
	 * divide two number 
	 * store the answer
	 * check the condition 
	 * condition true , print divisible by 5
	 * condition false ,print not divisible by 5*/
	
	public void methodName() {
	int a = 50 ;
	int b =5;
	int c= a%b;
	if(c==0) {
		System.out.println("my value is divisble by 5");
	}
	else 
	{
	System.out.println("my value is not dvisble by 5");
	}
	
	}
	
	
	public String methodA(){
		String s ="Muthukumaran S";
		return s;
		}
	

	public static void main(String[] args) {
		DivisbilbeBy5 ref = new DivisbilbeBy5();
		ref.methodName();
		String apple = ref.methodA();
	}

}
