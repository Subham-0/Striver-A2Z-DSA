package Basic_Math;

import java.util.Scanner;

public class Solution {
    void countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println(count);

        // or
        // int count = (int) (Math.log10(n) + 1);
        // System.out.println(count);
    }

    void reverseInteger(int n) {
        int lastdigit = 0;
        int reverseNumber = 0;
        while (n != 0) {
            lastdigit = n % 10;
            reverseNumber = reverseNumber * 10 + lastdigit;
            n = n / 10;

        }
        if (reverseNumber > Integer.MAX_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
            reverseNumber = 0;
        }
        if (reverseNumber < Integer.MIN_VALUE / 10 || (reverseNumber == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
            reverseNumber = 0;
        }

        System.out.println(reverseNumber);
    }

    void reverseNumber(long n) {
        long lastdigit = 0;
        long reverseNumber = 0;
        while (n != 0) {
            lastdigit = n % 10;
            reverseNumber = reverseNumber * 10 + lastdigit;
            n = n / 10;

        }
        System.out.println(reverseNumber);
    }

    void isPalindromeNumber(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum * 10 + digit;
            temp /= 10;
        }
        System.out.println((sum == n) ? "It is an Palindrome number" : "It is not an Palindrome number");
    }

    void armStrong(int n) {
        int temp = n;
        int sum = 0;
        // int length = (int) (Math.log10(n) + 1);
        int length = String.valueOf(n).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }

        System.out.println((sum == n) ? "It is an Armstrong number" : "It is not an Armstrong number");

    }

    void allDivisor(int n) {

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            // obj.countDigits(n);
            // obj.reverseInteger(n);
            // obj.reverseNumber(n);
            // obj.isPalindromeNumber(n);
            // obj.armStrong(n);
            obj.allDivisor(n);

        }
        sc.close();
    }
}
