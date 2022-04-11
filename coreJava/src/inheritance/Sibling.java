package inheritance;

public class Sibling{

	public static void main(String[] args) {
		
		ParentClass a = new ChildClass(); // will print 10
		
		//ChildClass a = new ChildClass(); will print 20
		System.out.println(a.sample);
	}

}
