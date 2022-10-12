package Recursion;

import java.util.Scanner;

public class LastNonZeroOfAFactorial {
    static int val[] = {1, 1, 2, 6, 4, 2, 2, 4, 2, 8};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));
    }
    static int lastNonZeroDigit(int n) {
        // Write your code here
        if (n < 10)
            return val[n];
        if (((n / 10) % 10) % 2 == 0)
            return (6 * lastNonZeroDigit(n / 5)
                    * val[n % 10]) % 10;
        else
            return (4 * lastNonZeroDigit(n / 5)
                    * val[n % 10]) % 10;
    }
}
