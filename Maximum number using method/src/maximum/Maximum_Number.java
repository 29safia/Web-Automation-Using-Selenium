package maximum;

import java.util.Scanner;

public class Maximum_Number {

    public static void max(int a, int b, int c) {
        int num1 = a;
        int num2 = b;
        int num3 = c;

        if(num1 >= num2) {
            if(num1 >= num3)
                System.out.println(num1 + " is the maximum number.");
            else
                System.out.println(num3 + " is the maximum number.");
        } else {
            if(num2 >= num3)
                System.out.println(num2 + " is the maximum number.");
            else
                System.out.println(num3 + " is the maximum number.");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        max(num1, num2, num3);
    }
}
