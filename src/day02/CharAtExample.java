package day02;

public class CharAtExample {

    static String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {

        char ch1 = pickName.charAt(9);
        char ch2 = pickName.charAt(0);
        char ch3 = pickName.charAt(21);

        System.out.println(""+ch1+ch2+ch3+ch2);
        System.out.println(ch1+""+ch2+ch3+ch2);
        System.out.println(ch1+ch2+ch3+ch2);
        System.out.println(ch1 + " " + ch2 + " " + ch3 + " " + ch2);

    }

}
