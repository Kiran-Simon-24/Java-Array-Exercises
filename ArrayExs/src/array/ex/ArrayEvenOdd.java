package array.ex;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int []{1,4,6,8,0,10,13,15};
		int even_count = 0, odd_count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				even_count++;
			}
			else {
				odd_count ++;
			}
		}
		System.out.println("Even count:"+ " " + even_count);
		System.out.println("Odd count:"+ " " + odd_count);
		
	}

}
