package static_nonstatic;

public class StaticVar {

	// instance variables
	String name;
	String address;
	// When you declare it static it will be shared to the obj and you not need to initialize
	// All static variables are class variables
	static String city = "Navotas"; 
	
	// all objects will use this variable so it will increment every time we instantiate an object
	// without static it will reset the value every object creation
	static int i = 0; 
	
	// Static block
	// shortcut for declaring static
	static {
		city = "Navotas";
		i =0;
	}
	 
	public StaticVar(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(address + " " + city);
	}
	
	public static void getCity() {
		// We cannot use non static variable to a static methods
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		
		StaticVar obj =  new StaticVar("Abe","Cavite");
		StaticVar obj2 =  new StaticVar("Gale","Metro Manila");
		StaticVar obj3 =  new StaticVar("Gale","Metro Manila");
		obj.getAddress();
		obj2.getAddress();
		StaticVar.getCity();
		StaticVar.i=4; // we can assign value to a static variable like this
		obj.address = "Cavite";
		
	}

}
