package array.ex;

public class ThirdLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5, 8, 9, 10, 11, 7, 21};
		
		System.out.println("Third Largest Number in arr[] is" + " " + getThirdLargest(arr));

	}

	static int getThirdLargest(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length - 3];

	}
}
