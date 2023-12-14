package array.ex;

public class FrequencyArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
        int fr[] = new int[arr.length]; // to store frequencies of element
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited; // to avoid counting same element again
                }
                if (fr[i] != visited) {
                    fr[i] = count;
                }
            }
        }
        System.out.println("----------------------");
        System.out.println("Element | Frequency");
        System.out.println("----------------------");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited) {
                System.out.println(" " + arr[i] + "   |   " + fr[i]);
            }
        }
        System.out.println("----------------------");

        System.out.println();
        
        ArrayBoolean(arr, fr);
    }

    // Write with boolean 

    static void ArrayBoolean(int arr[], int fr[]) {
        boolean duplicate[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!duplicate[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        duplicate[j] = true;
                    }
                }
                fr[i] = count;
            }
        }
        System.out.println("----------------------");
        System.out.println("Element | Frequency");
        System.out.println("----------------------");
        for (int i = 0; i < fr.length; i++) {
            if (!duplicate[i]) {
                System.out.println(" " + arr[i] + "   |   " + fr[i]);
            }
        }
        System.out.println("----------------------");
    }
}
