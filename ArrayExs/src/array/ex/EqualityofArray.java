package array.ex;


public class EqualityofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 4, 5, 6, 8, 9, 11 };
		int arr1[] = { 1, 3, 4, 5, 6, 8, 9, 11 };
		if (arr.length == arr1.length) {
			System.out.println("Arrays of length is equal");
		} else {
			System.out.println("Arrays of length is not equal");
		}
		int[] result = largestORsmallest(arr);
		int max = result[0];
		int min = result[1];
		System.out.println("largest" + " " + max);
		System.out.println("Smallest" + " " + min);

		average(arr, max, min);
	}

	static int[] largestORsmallest(int a[]) {
		int largest = a[0], smallest = a[0];
		for (int i = 1; i < a.length; i++) {
			if (largest < a[i]) {
				largest = a[i];
			} else if (smallest > a[i]) {
				smallest = a[i];
			}
		}
		int[] result = { largest, smallest };
		return result;
	}

	static void average(int a[], int max, int min) {
		int sum = 0, avg;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] != max) && (a[i] != min)) {
				sum += a[i];
			}
		}
		avg = sum / (a.length - 2);
		System.out.println("Average value is:" + " " + avg);
	}

}
