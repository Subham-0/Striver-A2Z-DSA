import java.util.Scanner;

public class if_Else2 {
    public static void main(String[] args) {
        /*
         * A school has following rules for grading system:
         * Below 25 - F
         * 25 to 44 - E
         * 45 to 49 - D
         * 50 to 59 - C
         * 60 to 79 - B
         * 80 to 100 - A
         * Ask user to enter marks and print th corresponding grade.
         */

        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if (mark < 25) {
            System.out.println("Grade-F");
        } else if (mark <= 44) {
            System.out.println("Grade-E");
        } else if (mark <= 49) {
            System.out.println("Grade-D");
        } else if (mark <= 59) {
            System.out.println("Grade-C");
        } else if (mark <= 79) {
            System.out.println("Grade-B");
        } else if (mark <= 100) {
            System.out.println("Grade-A");
        }

        sc.close();
    }
}
