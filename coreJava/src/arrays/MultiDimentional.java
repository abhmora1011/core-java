package arrays;


public class MultiDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[4][2];
		
		a[0][0] = 10;
		a[0][1] = 12;
		a[1][0] = 15;
		a[1][1] = 42;
		a[2][0] = 33;
		a[2][1] = 24;
		a[3][0] = 11;
		a[3][1] = 19;
		
		int b[][] = {
				{10,12},
				{15,42},
				{33,24},
				{11,19}
				};
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
