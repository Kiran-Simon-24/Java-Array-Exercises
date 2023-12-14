package array.ex;

public class SumInArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int total =calculate(arr);
        System.out.println("Sum of all the element of an array:"+" "+total);
    }
    static int calculate(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum = sum + i;
        }
        return sum;
    }
}
