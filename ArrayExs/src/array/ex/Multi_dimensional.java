package array.ex;


public class Multi_dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 2, 5, 6 }, { 4, 5, 8 } };
		for (int i = 0; i < arr.length; i++) { // for row
			for (int j = 0; j < arr.length; j++) { // for column
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		matrix_addition();

		System.out.println();
		matrix_multiplication();

	}

	static void matrix_addition() {
		int a[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
		int c[][] = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void matrix_multiplication() {
		int a[][] = { { 1, 3, 4 }, { 3, 4, 5 }, { 3, 3, 3 } };
		int b[][] = { { 1, 3, 4 }, { 3, 4, 5 }, { 3, 3, 3 } };
		int c[][] = new int[3][3];
		for (int i = 0; i < 3 ; i++) {
			for (int j = 0; j < 3; j++) {
				 // c[i][j] = 0; 
				for (int k = 0; k < 3; k++) {

					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}
