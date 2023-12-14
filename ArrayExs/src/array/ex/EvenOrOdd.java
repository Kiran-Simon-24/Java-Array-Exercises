package array.ex;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        IsEven(number);
        scan.close();
    }

    static void IsEven(int n) {

        if (n != 0 && n % 2 == 0) {
            System.out.print(n + " " + " is a even number");
        } else if (n != 0 && n % 2 != 0) {
            System.out.print(n + " " + "is a odd number");
        } else {
            System.out.print(n + " " + "is a netural number");
        }
    }
}
