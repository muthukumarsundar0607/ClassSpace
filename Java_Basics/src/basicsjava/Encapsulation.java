package basicsjava;

public class Encapsulation {

	private int age;
	private int height;
	private int days;

	private int methodA() {
		age = 35;
		return age;
	}
	
	
	public void set(int old, int tall , int hours) {
		this.age=old;
		this.height=tall;
		this.days=hours;
	}
	
	
	public int getage() {
		return age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getdays() {
		return days;
	}

	/*
	 * Private- It can be accessible only in the same class 
	 * Encapsulation - Accessing the private variable from another class
	 * Encaptulation (Data Hiding ) - It is a process hiding the data variable  present in the class and not exposing to the another class completely 
	 * Process- Another class member can use the private variable by void set and return get method .
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
