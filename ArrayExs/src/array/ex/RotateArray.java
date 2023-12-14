package array.ex;
import java.util.Arrays;

public class RotateArray {
    public static  void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5};
        int [] arr1 = Arrays.copyOf(arr,arr.length);

        System.out.println("Original array:");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int n =3;

        System.out.println("After Left Rotate array:");
        left(arr,n);
        for(int i =0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("After Right Rotate array:");
        right(arr1,n);
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
    }

    // Left Rotate
    static void left(int[] arr1, int n){
        for(int i = 0; i < n; i++){
            int j,first;
            first = arr1[0];
            for(j=0; j< arr1.length-1;j++){
                arr1[j] = arr1[j+1];
            }
            arr1[j] = first;
        }
    }

    //Right Rotate
    static void right(int[] arr2, int n){
        for(int i = 0; i < n; i++){
            int j,last;
            last = arr2[arr2.length-1];
            for(j = arr2.length-1; j > 0; j--){
                arr2[j] = arr2[j-1];
            }
            arr2[0] = last;
        }
    }
}

