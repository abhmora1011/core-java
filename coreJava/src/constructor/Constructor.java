package constructor;

public class Constructor {

	/*
	 * Block of code is executed when an object is created
	 * 
	 * Name of Constructor is same as the Class Name
	 */

	public Constructor() {
		System.out.println("I'm the constructor");
	}
	
	public Constructor(String name) {
		System.out.println("I'm " + name);
	}

	public void getData() {
		System.out.println("I'm the method");
	}

	public static void main(String[] args) {
		
		Constructor dc = new Constructor();
		Constructor dc2 = new Constructor("Abraham");
		// When you create an object the constructor is automatically invoked
	}

}
