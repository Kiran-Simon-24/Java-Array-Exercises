package array.ex;


public class Sumofpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 5, 10, 15, 20, 25, 30 };
		int temp = 0, spec = 30;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				temp = arr[i] + arr[j];
				if (temp == spec) {
					System.out
							.println("Pair of elements whose sum is equal to " + spec + ": " + arr[i] + ", " + arr[j]);
				}

			}
		}
		exact();
	}

	static void exact() {
		int a[] = { 10, 20, 23, 30, 10, 11, 10 };
		int sum = 0, exact = 30;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 10) {
				sum += a[i];
			}
		}
		if (sum == exact) {
			System.out.println("Sum is equal to" + " " + exact);
		} else {
			System.out.println("Sum is not equal to" + " " + exact);
		}

	}

}
