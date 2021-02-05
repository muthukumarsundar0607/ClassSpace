package basicsjava;

public class ArrayClass {
	
	public void arrayMethodOne()
	{
		float myarray[]= {5.2f,6.2f,7.2f,8.2f};
		int arrsize= myarray.length;
		System.out.println(arrsize);
	}
	
	public void  arrayMethodTwo() 
	{
		long cts[]= {852,963,741,852,852,963};
		int returnsize= cts.length; //6
		System.out.println(returnsize); 
		
		for (int i=0 ; i< returnsize; i++) {
			System.out.println(cts[i]);  
		}
	
	}
	
	public void  arrayMethodThree() {
		
		
		int arr[][]= new int [5][5];
	}
	
	
	

	public static void main(String[] args) {
	
		
		ArrayClass ref = new ArrayClass();
		ref.arrayMethodTwo();

	}

}
