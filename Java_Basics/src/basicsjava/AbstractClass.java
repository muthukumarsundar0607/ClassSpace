package basicsjava;

public abstract class AbstractClass {

	
	public void methodNameA() {
		System.out.println("Non Abstract Method ");
	}
	
	public abstract void methodNameB();
	
	
	private void methodNameC() {
		System.out.println("Non Abstract Method ");
	}
	
	protected void methodNameD()
	{
		System.out.println("protected Method ");
	}
	
	
	//private abstract void MethodF();
	 
	//public abstract final void methodNameH();
	
	//public abstract static void methodNameG();
	
	public  static void methodNameG() {
		System.out.println("static  Method ");
	}
	
	public AbstractClass() {
		System.out.println("MuthukumaransS");
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
