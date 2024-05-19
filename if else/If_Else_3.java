import java.util.Scanner;

public class If_Else_3 {

    /*
     * Take the age from the user and then decide accordingly
     * 1.if age < 18,
     * print -> not eligible for job
     * 2.if age >=18,
     * print -> eligible for job
     * 3.if age >=55 and age <= 57,
     * print -> "eligible for job, but retirement soon."
     * 4.if age > 57
     * print -> retirement time
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("not eligible for job");
        } else if (age > 57) {
            System.out.println("retirement time ");
        } else if (age >= 55 && age <= 57) {
            System.out.println("eligible for job, but retirement soon");
        } else {
            System.out.println("eligible for job");
        }

        sc.close();
    }
}
