package patterns;

import java.util.Scanner;

public class Solution {
    void print1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    void print2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    void print3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }

    }

    void print4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }

    }

    void print5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    void print6(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }

    }

    void print7(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void print8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < (2 * n) - (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void print9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
    }

    void print10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void print11(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    void print12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {

            // number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;

        }

    }

    void print13(int n) {
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++k + " ");
            }
            System.out.println();
        }

    }

    void print14(int n) {
        for (int i = 1; i <= n; i++) {
            char letter = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(letter++ + " ");
            }
            System.out.println();
        }

    }

    void print15(int n) {
        for (int i = 1; i <= n; i++) {
            char letter = 'A';
            for (int j = n; j >= i; j--) {
                System.out.print(letter++ + " ");
            }
            System.out.println();
        }

    }

    void print16(int n) {
        char letter = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(letter + " ");
            }
            System.out.println();
            ++letter;
        }
    }

    void print17(int n) {
        for (int i = 1; i <= n; i++) {
            char letter = 'A';

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int break_point = i;
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j >= break_point) {
                    System.out.print(letter--);
                } else {
                    System.out.print(letter++);
                }
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    void print18(int n) {

        for (int i = 1; i <= n; i++) {
            char letter = 'E';

            for (int j = 0; j < i; j++) {
                System.out.print(letter);
                letter--;

            }

            System.out.println();

        }
    }

    void print19(int n) {
        int intialspace = 0;
        for (int i = 0; i < n; i++) {
            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < intialspace; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            intialspace += 2;
            System.out.println();
        }
        // after symmetry
        intialspace = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            // star
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < intialspace; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            intialspace -= 2;
            System.out.println();
        }

    }

    void print20(int n) {
        int space = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) {
                space -= 2;
            } else {
                space += 2;
            }
        }
    }

    void print21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void print22(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int top = i - 1;
                int left = j - 1;
                int bottom = 2 * n - 1 - i;
                int right = 2 * n - 1 - j;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(right, left)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            // obj.print1(n);
            // obj.print2(n);
            // obj.print3(n);
            // obj.print4(n);
            // obj.print5(n);
            // obj.print6(n);
            // obj.print7(n);
            // obj.print8(n);
            // obj.print9(n);
            // obj.print10(n);
            // obj.print11(n);
            // obj.print12(n);
            // obj.print13(n);
            // obj.print14(n);
            // obj.print15(n);
            // obj.print16(n);
            // obj.print17(n);
            // obj.print18(n);
            // obj.print19(n);
            // obj.print20(n);
            // obj.print21(n);
            obj.print22(n);

        }
        sc.close();
    }
}
