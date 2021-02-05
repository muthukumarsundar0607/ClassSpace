package basicsjava;

public class Human  {
	
	public void Pongal() {
		
	}

	
	public static void main(String[] args) {
		Encapsulation ref = new Encapsulation();
		
		ref.set(20, 6, 254);
		
		int myenpage= ref.getage();
		int myenpheigh=ref.getHeight();
		int myenpdays= ref.getdays();
		
		System.out.println(myenpage);
		System.out.println(myenpheigh);
		System.out.println(myenpdays);
		

	}

}
