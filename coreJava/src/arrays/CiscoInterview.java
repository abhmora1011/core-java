package arrays;

public class CiscoInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int abc[][] = {{2,-1,0},{3,7,7},{1,2,9}};
		
		
		int temp = abc[0][0];
		int minColumn = 0;
		
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				
				if(temp > abc[i][j]) {
					temp = abc[i][j];
					minColumn = j;
					
				}
				
				
			}
			
		}
		
		int max = abc[0][minColumn];
		int k =0;		
		while (k < 3 ) {
			
			if(abc[k][minColumn] > max) {
				max = abc[k][minColumn];
			}
			k++;
		}
		
		
		
		System.out.println("The smallest number in the matrix is :" + temp);
		System.out.println("The largest number in the column is :" + max);

	}

}
