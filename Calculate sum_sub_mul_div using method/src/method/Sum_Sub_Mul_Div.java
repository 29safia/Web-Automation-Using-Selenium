package method;

import java.util.Scanner;

public class Sum_Sub_Mul_Div {

    public static void calculate(int a, int b) {
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("Sum is : " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculate(a, b);

    }
}
