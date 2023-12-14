package array.ex;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        System.out.println("Original Array: ");
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("Reverse Array: ");
        for(int j=arr.length-1; j>=0; j--){
            System.out.println(arr[j]);
        }
    }
}
