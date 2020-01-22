import java.util.Scanner;

public class UperLowerCase {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("  please Enter any alphabet in upper case");
        String alpha = scaner.next().toLowerCase();
        char alphabet = alpha.charAt(0);
        System.out.println("lowercase of entered alphabet is " + alphabet);

    }
}
