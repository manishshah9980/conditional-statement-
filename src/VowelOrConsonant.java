import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" please enter single character from alphabet ");

        char abcd = scanner.next().charAt(0);

        if (abcd == 'A' || abcd == 'E' || abcd == 'I' || abcd == 'O' || abcd == 'U'||abcd == 'A'||abcd == 'E'|| abcd == 'I'|| abcd == 'O'||abcd =='U')

        {
            System.out.println(" input letter is Vowel");

        }
        else
        {
            System.out.println("input letter is consonant");


        }
    }




    }

