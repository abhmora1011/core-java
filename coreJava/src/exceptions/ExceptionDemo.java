package exceptions;

public class ExceptionDemo {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 7;
		int c = 0;
		
		try {
			
			//int k=b/c;
			//System.out.println(k);
			
			int arr[] = new int[2];
			
			System.out.println(arr[7]);
			
		} 
		catch(IndexOutOfBoundsException ets) {
			System.out.println("Index bound exception");
		}
		catch (ArithmeticException et) {
			System.out.println("Error");
		}
		catch (Exception e) {
			
			System.out.println("Try catch error due to " + e);
		
		}
	}

}
