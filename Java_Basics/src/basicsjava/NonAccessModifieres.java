package basicsjava;

public  class NonAccessModifieres {
	
	/*
	 * static 
	 * final 
	 * abstract 
	 * native
	 * synchronised 
	 * volatile 
	 * transient
	 * strictfp 
	 * */
	
	/*These non access modifieres will be respective to the methods and classes  
	 * after the modifieres in class and method we will providing the non access modiferes 
	 * No , It is not a mandatory to have non access modifiers . 
	 * 
	 * 
	 * Static - 
	 * Static always refers to the class , not the object 
	 * directly , or with the help of classname.methodname()
	 * once the values are changed in the static variable or method , same will be reflected throughout the class
	 * will be providing method level and variable level 
	 * we can't provide static keyword to the class , bec static refers to the class which is not possible to provide in the class level
	 * We can access only static variable , static members inside the static method  .
	 * We can access static variable and methods in the Non static method . */
	
	/*Final */
	
	public static int a =25;
	public static int b= 35;
	public static int d= 60;
	
	public static void normalA() {
		int c=d;
	}
	
	
	public static void namod01() {
		 a=a+b;
		 d=b;
		 normalA();
		
	}
	

	
	public void methodA() {
		
	}

	public static void main(String[] args) {
		namod01();
		NonAccessModifieres.namod01();
		NonAccessModifieres obj1 = new NonAccessModifieres();
		NonAccessModifieres obj2 = new NonAccessModifieres();
	}

}
