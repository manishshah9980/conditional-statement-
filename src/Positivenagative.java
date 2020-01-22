import java.util.Scanner;

public class Positivenagative {
    // finding positive or nagative or zero

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter any number");

        int num2 = scanner.nextInt();

        if (num2==0){
            System.out.println(" the given number " + num2 + " is zero value");

        }
        else if (num2>0) {
            System.out.println(" the given number " + num2 +"is positive value");

        }
        else {
            System.out.println(" the given number "+num2+" is nagative value");
        }
    }
}
