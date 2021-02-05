package basicsjava;

public class Male extends Human {
	
	
	/*different classes when extends ,if one method found in the parent class is present in the  child  class  it is called overridding
	 * A method which is present in the parent class is same present in the child classs is knnown as overriding 
	 * Overloading Can be done : 
	 * public - public method overridden 
	 * private -  cannot be overridden
	 * protected - Can be overridden unless protected modifiers conditions are satisfied
	 * default -- Can be overridden unless default modifiers conditions are satisfied
	 * static--cannot be overridden
	 * final-- Cannot be overridden and Compilation error is thrown 
	 * abstract*/
	
	
	public void deevali() {
		super.Pongal();
	}
	
	public void voice () {
		
		System.out.println("Male voice are so base and dump");

	}
	
     private void hairStyle() {
		
		System.out.println("Hairstling are done by MALE ");
		
	}
     
     protected void dressstyle() {
 		
 	}
     
     void accessories() {
 		
 	}
     
     public static void Jewels() {
 		
 	}
     
	/*
	 * public final void PhoneCoverCases() {
	 * System.out.println("My Final method parent "); }
	 * 
	 */	

	public static void main(String[] args) {
		

	}

}
