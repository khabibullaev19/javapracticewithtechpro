package day01;

public class JustString {

    public static void main(String[] args) {

        String name1 = "Ali";
        String name2 = new String("Ali");
        String name3 = "Ali";

        System.out.println(name1.equals(name2));//true
        System.out.println(name1 == name2);//false
        System.out.println(name1 == name3);//true
        System.out.println(name2.contains(name1));//true

    }

}
