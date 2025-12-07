package day02;

import java.util.Scanner;

public class IfElseStatement {

    static String jobTitle = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String qa = "Quality Analyst";
        String dev = "Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";

        do {
            System.out.print("Enter your job title: ");
            jobTitle = scanner.nextLine();

            if (!(jobTitle.equalsIgnoreCase("qa") || jobTitle.equalsIgnoreCase("dev") || jobTitle.equalsIgnoreCase("ba") || jobTitle.equalsIgnoreCase("pm"))){
                System.out.println("You entered wrong title!");
            }

        } while (!(jobTitle.equalsIgnoreCase("qa") || jobTitle.equalsIgnoreCase("dev") || jobTitle.equalsIgnoreCase("ba") || jobTitle.equalsIgnoreCase("pm")));

        if (jobTitle.equalsIgnoreCase("qa")){
            System.out.println(qa);
        } else if (jobTitle.equalsIgnoreCase("dev")) {
            System.out.println(dev);
        } else if (jobTitle.equalsIgnoreCase("ba")) {
            System.out.println(ba);
        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println(pm);
        }

    }

}
