package even_odd_number;

import java.util.Scanner;

public class EvenOdd {

    public static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        evenOdd(num);

    }
}
