package array.ex;

public class LargestAndSmallestInArray {
    public static void main(String[] args){
        int[] arr1 = {25,11,7,75,56};
        int large = largest(arr1);
        int small = smallest(arr1);
        System.out.println("Largest element in given array is:"+" "+ large);
        System.out.println("Smallest element in given array is:"+" "+ small);


    }
    static int largest(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
    static int smallest(int[] arr){
        int min = arr[0];
        for(int i: arr){
            if(i<min){
                min = i;
            }
        }
        return min;
    }
}
