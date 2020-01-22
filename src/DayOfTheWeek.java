import java.util.Scanner;

public class DayOfTheWeek {

    // finding day of the week

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter any day number of the week");

        int week = scanner.nextInt();
        switch (week) {

            case 1 :
                System.out.println(" 1st day of the week is monday");
                break;

            case 2 :
                System.out.println(" 2nd day of the week is tuesday");
                break;

            case 3 :
                System.out.println(" 3rd day of the week is wednesday");
                break;

            case 4 :
                System.out.println(" 4th day of the week is thursday");
                break;

            case 5 :
                System.out.println(" 5th day of the week is friday");
                break;

            case 6 :
                System.out.println(" 6th day of the week is saturday");
                break;

            case 7 :
                System.out.println(" 7th day of the week is sunday");
                break;


            default:
                System.out.println(" pls enter valid day number of the week");

        }
    }
}
