package array.ex;

public class Average_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 0, avg;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Average value is:" + " " + avg);
		reverse(arr);
	}
	static void reverse(int a[]) {
		int j = 1;
		for(int i = 0; i < a.length/2; i++) {
			int temp = a[i];
			a[i] = a[a.length-j];
			a[a.length-j] = temp;
			j++;
		}
		for (int i : a) {
		System.out.print(i + " ");}
	
	}
	
}
