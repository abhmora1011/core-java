package function_overloading;

public class MainClass {

	public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		
		obj.getSample(10);
		obj.getSample("Abe");
		obj.getSample("Abe", 11);
		
	}
	
	public void getSample(int a) {
		System.out.println(a + " 10");
	}
	
	public void getSample(String a) {
		
	}

	public void getSample(String a, int b) {
	
	}
	
}
