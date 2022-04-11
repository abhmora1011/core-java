package inheritance;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		obj.color();
		
	}
	
	int sample = 20;
	
	public void engine() {
		System.out.println("New Engine");
	}
	
	public void color() {
		System.out.println(color);
	}

}
