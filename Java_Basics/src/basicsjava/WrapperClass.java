package basicsjava;

public class WrapperClass {
	
	public void basicMethod() {
		int a ; 
		long b ; 
		short c;
		byte d;
		boolean e; 
	}
	
	public void Methodref() {
		

		Long refa = new Long(34456677);
		long bref= refa; //UnBoxing ;
		
		boolean f= true ;
		Boolean refb = f; //Auto boxing 
		
	}
	
	public void TopicTwo() {
		int a = 345; 
		long b = a; // up Casting or Auto Casting 
		short c= (short) a;// down casting or Narrow Casting 
	}
	

	public static void main(String[] args) {
		

	}

}
