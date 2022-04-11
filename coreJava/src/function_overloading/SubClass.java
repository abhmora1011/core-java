package function_overloading;

public class SubClass extends MainClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClass a = new SubClass();
		a.getSample(20);

	}
	
	// This overrides the function present in the parent class
	public void getSample(int a) {
		System.out.println(a + " 20");
	}
	
	public void getSample(String a) {
		
	}

	public void getSample(String a, int b) {
	
	}

}
