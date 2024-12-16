package input_output;

import java.util.Scanner;

public class User_Input {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Name is : "+name);
   System.out.println("Enter your age: ");
   double age = input.nextDouble();
   System.out.println("Age is : "+age);

    }
}
