import java.util.Scanner;

public class Eligibleforvote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your age ");

        int age1 = scanner.nextInt();

        if (age1 >= 18 ) {

            System.out.println(" you are eligible for vote");

        } else {

            System.out.println(" you are not eligible for vote. you must be older than or equal to 18 years");

        }
    }
}
