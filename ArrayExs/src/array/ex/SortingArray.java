package array.ex;


public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 4, 5, 8, 8, 10, 22, 7, 6 };
		
		String[] data = { "Hello", "Hight", "Tall", "Computer" };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending sorted array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if ((data[i].compareTo(data[j]) > 0)) {
					String temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}

			}
			System.out.print(data[i] + " ");
		}
	}

}
