import java.util.Scanner;

public class Citynames {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter any alphabet");


        String alphabet = scanner.next().toUpperCase();
        char ch = alphabet.charAt(0);

        switch (ch) {
            case 'A' :
                System.out.println("Ajmer");
                break;

            case 'B' :
                System.out.println("Bombay");
                break;

            case 'C' :
                System.out.println("chennai");
                break;

            case 'D' :
                System.out.println("Delhi");
                break;
            case 'E' :
                System.out.println("Edgware");
                break;
            case 'F' :
                System.out.println("Faridabad");
                 break;
            default:
                System.out.println("Invalid entry");


        }
    }
}
