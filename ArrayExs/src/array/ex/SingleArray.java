package array.ex;


public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int []arr = new int[5]; arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40;
		 * arr[4] = 50; for(int i = 0; i < arr.length; i++) {
		 * System.out.println(arr[i]); }
		 */
		int arr1[] = { 16, 120, 13, 14, 15 };
		min(arr1);
		max(arr1);

	}

	static void min(int a[]) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);

	}
	static void max(int a[]) {
	int max =a[0];
	for(int i = 1; i < a.length; i++) {
		if(max < a[i]) {
			max = a[i];
		}
	}
	System.out.println(max);
	
	}

}
