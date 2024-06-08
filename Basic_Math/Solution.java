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

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }
        }
        System.out.println();
    }

    void primeNumber(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }

        }
        if (count == 2) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    int gcd(int a, int b) {
        // Bruteforce Approach

        // int gcdNum = 1; // 1 is common factor all number
        // for (int i = 1; i < Math.min(a, b); i++) {
        // if (a % i == 0 && b % i == 0) {
        // gcdNum = i;
        // }
        // }
        // return gcdNum;

        // Better Approach
        // iterate from the minimum of a and b because the greastest common divisor of
        // two munbers can not exceed the smaller number.
        // for (int i = Math.min(a, b); i > 0; i--) {
        // if (a % i == 0 && b % i == 0) {
        // return i;
        // }
        // }
        // return 1;

        // optimal Approach
        // by Euclidean Algorthm
        while (a > 0 && b > 0) {
            if (a > b) {
                // a = a - b;
                a = a % b;
            } else {
                // b = b - a;
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }

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
            // obj.allDivisor(n);
            obj.primeNumber(n);
            int ans = obj.gcd(21,42); // greatest common divisor
            System.out.println(ans +" is gcd the numbers");
        }
        sc.close();

    }
}
