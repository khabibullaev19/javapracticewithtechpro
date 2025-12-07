package day02;

import java.util.Scanner;

public class IfElseStatement2 {

    static int num1;
    static int num2;
    static String operation;
    static int result;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please enter the 1st operation number: ");
            num1 = scanner.nextInt();

            System.out.print("Please enter the 2nd operation number: ");
            num2 = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter one of the given signs(\"+\",\"-\",\"*\",\"/\"): ");
            operation = scanner.next();

            if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))){
                System.out.println("You entered wrong sign('\"+\"','\"-\"','\"*\"','\"/\"')");
            }

        }while (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")));

        if (operation.equals("/") && num2 == 0) {
            System.out.println("You cannot divide by 0");
            System.exit(1);
        }

        if (operation.equals("+")){
            result = num1 + num2;
        } else if (operation.equals("-")){
            result = num1 - num2;
        } else if (operation.equals("*")){
            result = num1 * num2;
        } else if (operation.equals("/")){
            result = num1 / num2;
        }

        System.out.println("Your result is " + result);

    }

}
