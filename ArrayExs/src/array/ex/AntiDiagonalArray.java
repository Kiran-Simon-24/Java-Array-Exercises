package array.ex;

import java.util.Arrays;

public class AntiDiagonalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int numRow = a.length;
		int numCol = a[0].length;
		int size = ((numRow * numCol) - numRow);
		int[] b = new int[size];
		int index = 0;

		for (int i = 0; i < numRow; i++) {
			for (int j = 0; j < numCol ; j++) {
				if (i != j) {

					System.out.print(a[i][j] + " ");
					b[index] = a[i][j];
					index++;

				}
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(b)); // print array;
	}

}
