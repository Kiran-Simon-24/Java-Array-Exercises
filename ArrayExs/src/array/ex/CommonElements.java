package array.ex;


public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 4, 5, 6, 7, 9, 10, 1, 2 };
		int b[] = { 1, 2, 11, 2, 13, 15, 15, 16, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			boolean alreadyprinted = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					if(!alreadyprinted) {
					System.out.print(a[i] + " ");
					alreadyprinted = true;
				}break;
					}

			}
		}
	}

}
