package operator;

import java.util.Scanner;

public class Arithmatic_Operator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Summation of a+b is : "+(a+b));
        System.out.println("Subtraction of a-b is : "+(a-b));
        System.out.println("Multiplication of a*b is : "+(a*b));
        System.out.println("Division of a/b is : "+(a/b));
        System.out.println("Modulus of a%b is : "+(a%b));

    }
}
