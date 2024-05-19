import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        // write a programe that takes an input of age and prints if you are adult or
        // not

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("your are not a adult");
        } else {
            System.out.println("Your are adult");
        }

        sc.close();

    }
}
