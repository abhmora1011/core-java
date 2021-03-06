package super_keyword;

public class ChildDemo extends ParentDemo{

	String name = "Hendrix";
	
	public ChildDemo() {
		super(); // To call the parent constructor and it always be in the first line
		System.out.println("Child class constructor");
	}
	
	public void getStringData() {
		
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public void getData() {
		super.getData();
		System.out.println("I'm in the child");
	}

	
	public static void main(String[] args) {
		
		ChildDemo cd = new ChildDemo();
		
		cd.getStringData();
		cd.getData();
	}

}
