package array.ex;

public class Ascending_DescendingArray {
    public static void main(String[] args){
        int [] arr ={5,2,8,7,1};
        int temp = 0;
        System.out.println("Original array:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        //Ascending Order
        for(int i = 0; i < arr.length; i++){
            for(int j =i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Ascending array:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Descending(arr,temp);
        System.out.println("Sorted Descending array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i ] + " ");
        }
    }
    static void Descending(int [] arr, int temp){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1;j < arr.length; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
