package array.ex;

public class Array {
    public static void main(String[] args) {
        printArray( new int[] { 1, 2, 3, 4, 5, 6 });
        
        
    }
    static void printArray(int arr[]){
        for(int i : arr){
            System.out.println(i);
        }
    }

}