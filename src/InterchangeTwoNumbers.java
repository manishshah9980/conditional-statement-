import java.util.Scanner;

public class InterchangeTwoNumbers {
    // find inter change value
    public static void main(String[] args) {

        int a, b, temp;
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter value of A and B :\n");

        System.out.println(" A = ");
        a = scanner.nextInt();
        System.out.println(" B = ");
        b = scanner.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println(" Number interchanged successfully..!!\n");

        System.out.println(" A = " + a);

        System.out.println(" \nB = " + b);
    }


















    }

