package basicsjava;

public class ForEach {
	public void arrMethod() {
		
		
		
		int arr[] = { 52, 25, 63, 85, 96 }; //create an array 
		
		
		
		
		for (int ref : arr) {    // map the arr each value to the reference 
			int a = 20;
			int b = ref + a;
			System.out.println("My Value after adding the value " + b);
		}

	}

	public static void main(String[] args) {

		ForEach obj = new ForEach();
		obj.arrMethod();

	}

}
