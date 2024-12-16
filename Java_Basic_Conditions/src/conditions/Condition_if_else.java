package conditions;

import java.util.Scanner;

public class Condition_if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a+" is greater than " +b);
        }
        else if (a==b){
            System.out.println(a+" is equal to " +b);
        }
        else {
            System.out.println(a+" is less than " +b);
            }

        System.out.println("Enter the text : ");
        String text = sc.nextLine();

        if (text.equalsIgnoreCase("safia")) {
            System.out.println("You are safia");

        }*/

        System.out.println("Enter the text : ");
        String text = sc.nextLine();

        switch (text){
            case "Paper":
                System.out.println("The text is Paper");
                break;

                case "Book":
                    System.out.println("The text is Book");
                    break;

                    default:
                        System.out.println("Unknown text");

        }
    }
}
