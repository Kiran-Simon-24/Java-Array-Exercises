package array.ex;


public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 4, 4, 5, 6, 7, 7, 7, 7 };
		int duplicate[] = new int[arr.length];
		int skip = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int d = 0; d < duplicate.length; d++) {
			
				if (arr[i] == duplicate[d]) {
					skip = arr[i];
				}
			}
			if (skip != arr[i]) {
				int duplicatecount = 1;

				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						duplicatecount++;
					}

				}
				if (duplicatecount > 1) {
					duplicate[count] = arr[i];
					System.out.println(
							"Duplicate value is:" + " " + arr[i] + "--->" + "Duplicate count : " + duplicatecount);
					;
				}
				count++;

			}
		}
	}

}
