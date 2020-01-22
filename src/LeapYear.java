import com.sun.deploy.security.SelectableSecurityManager;
// program to find a leap year
import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the year");
        int number1 = scanner.nextInt();
        if (number1 % 400 == 0) {
            System.out.println(number1 + " is a leap year");

        }
        else if (number1 % 4 == 0 && number1 % 100 != 0)

        {
            System.out.println(number1 + " is a leap year ");

        }

        else
        {
            System.out.println(number1 + " is not a leap year ");
        }
    }

    }

