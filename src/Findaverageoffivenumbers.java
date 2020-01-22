import java.util.Scanner;

// finding everage of five numbers
public class Findaverageoffivenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 5 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();


        System.out.println(" average of above numbers is :"+ (a+b+c+d+e)/5.0);
    }
}
