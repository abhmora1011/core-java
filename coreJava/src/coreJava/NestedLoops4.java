package coreJava;

public class NestedLoops4 {
	
	public static void main(String[] args) {
		
		int count = 3;
		for (int i = 1; i<5; i++)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print(count + " ");
				count+=3;
			}
			
			System.out.println();
		}
		
	}

}
