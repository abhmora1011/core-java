package this_keyword;

public class ThisDemo {

	int a = 2;

	public void getData() {
		
		int a = 3;
		
		System.out.println(a + this.a); // this is used to catch the class level data
	}

	public static void main(String[] args) {

		
		ThisDemo sample = new ThisDemo();
		
		sample.getData();
		
	}

}
