package day02;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int integer = scan.nextInt();
        System.out.println("You entered " + integer);

        System.out.print("Enter a Double: ");
        double d = scan.nextDouble();
        System.out.println("You entered " + d);

        System.out.print("Enter a char: ");
        char c = scan.next().charAt(0);
        System.out.println("You entered " + c);

        scan.nextLine();

        System.out.print("Enter a String: ");
        String str = scan.nextLine();
        System.out.println("You entered " + str);

        scan.close();

    }

}
