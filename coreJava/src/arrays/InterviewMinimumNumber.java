package arrays;


public class InterviewMinimumNumber {

	public static void main(String[] args) {
		
		int abc[][] = {{-1,4,5},{3,-10,0},{1,2,9}};
		
		
		int temp = abc[0][0];
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				// System.out.println(abc[i][j]);
				
				if(temp > abc[i][j]) {
					temp = abc[i][j];
				}
				
			}
			
		}
		
		System.out.println("The smallest number in the matrix is :" + temp);

	}

}
