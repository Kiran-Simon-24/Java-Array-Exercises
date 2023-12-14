package array.ex;

public class EvenPositionArray {
    public static void main(String[] args){
        int [] arr = new int []{1,2,3,4,5};
        System.out.println("Elements of given array present on even position: ");
        for(int i = 1; i< arr.length; i+=2){
        System.out.println(arr[i]);
        }
        Odd(arr);
    }
    public static void Odd(int [] arr1){
        System.out.println("Elements of given array present on odd position:");
        for(int j=0; j<arr1.length; j+=2){
            System.out.println(arr1[j]);
        }
    }
}
