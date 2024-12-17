package exception;

import java.util.Scanner;

public class Exception_Error {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("enter 1st number : ");
      int a = sc.nextInt();
      System.out.println("enter 2nd number : ");
      int b = sc.nextInt();

      try {
          int c = a/b;
          System.out.println("result is : " + c);
      }catch(ArithmeticException e) {
          System.out.println("can't divide by zero");
      }finally {
          System.out.println("finally block is executed");
      }
    }
}
