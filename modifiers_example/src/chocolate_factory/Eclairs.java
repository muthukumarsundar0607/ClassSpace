package chocolate_factory;

public class Eclairs {

	public void eclarschoco() {
		System.out.println("My Eclairs 2021");
	}

	protected void eclarscaramel() {
		System.out.println("Ecalairs caramel fun");
	}

	void eclarscranberry() {
		System.out.println("Ecalairs carnberry time");
	}

	private void eclarsmango() {
		System.out.println("Ecalairs mango  days");
	}

	public static void main(String[] args) {

		Eclairs ref = new Eclairs();
		ref.eclarschoco();
		ref.eclarscaramel();
		ref.eclarscranberry();
		ref.eclarsmango();

	}

}

//Modifiers are used to provide the access for the method and class either in their packages or in subpackages - modiferes 
// public , private , protected , default 

// public .. 

//private ./..

// protected.. access

//defaut ... 