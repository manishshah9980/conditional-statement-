import java.util.Scanner;

public class Findnumberstosymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" please Enter first number");
        int a = scanner.nextInt();
        System.out.println("please enter second number");
        int b = scanner.nextInt();




        int total = a+b;
        int mult = a*b;
        int sub1 = a-b;
        int div = (a/b);

        System.out.println( " Enter symbol valid symbol - + / * ");
        String symbol = scanner.next();
        char symbol1 = symbol.charAt(0);
        switch (symbol1)
        {
            case'+' :
                System.out.println(" the addition of "+ a +" +" +b+" is = " + total);
                break;
            case '-' :
                System.out.println(" the sustraction of "+a+"-"+b+"is = "+sub1);

            case '*' :

                System.out.println(" the multiplication of "+a+"*" +b+"is = "+mult);
                break;

            case '/' :

                System.out.println(" the division of "+a+" / "+b+" is = " +div);
                break;

            default:
                System.out.println(" enter valid symbol");

        }
    }
}
