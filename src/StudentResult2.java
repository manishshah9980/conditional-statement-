import java.util.Scanner;
// finding students percentage grade and pass or fail
public class StudentResult2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter student name ");
        String name1 = scanner.next();
        System.out.println(" enter the roll no.");
        int rollnum = scanner.nextInt();
        System.out.println(" enter english subject marks");
        int eng1 = scanner.nextInt();

        System.out.println("enter maths subject marks");
        int mat1 = scanner.nextInt();

        System.out.println(" enter science subject marks");
        int sci1 = scanner.nextInt();

        int total1 = eng1 + mat1 + sci1;
        double per1 = (total1 * 100.0) / 300.0;
        double per = Math.round(per1 * 100.00) / 100.00;

        System.out.println(" student name is " + name1);
        System.out.println(" roll number is " + rollnum);
        System.out.println(" english marks :" + eng1);
        System.out.println(" maths marks :" + mat1);
        System.out.println(" science marks : " + sci1);

        System.out.println(" total marks :" + total1);
        System.out.println("percentage is :" + per + "%");

        if (eng1>=35 && mat1>=35 && sci1>=35) {
            System.out.println("your result = pass");
        }
        else
        {
            System.out.println("your result = fail");

        }
        if (per>=80 && eng1 >=35 && sci1>=35)
        {
            System.out.println("your pass grade is A+");

        }
        else if (per>=60 && eng1 >=35 && mat1>= 35 && sci1>= 35) {
            System.out.println("your pass grade is A");
        }
        else if (per>=50 && eng1 >=35 && mat1 >=35 && sci1>=35)
        {
            System.out.println("your pass grade is c");



        }


    }
}

