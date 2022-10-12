package Recursion;

import java.util.Scanner;

public class SumOfGP {
    static long gp(long a, long r, long n, long m)
    {
        {
            long answer;
            answer = a * SumofGP(r, n, m);
            answer = answer % m;

            return answer ;
        }
    }
    static long SumofGP(long r, long n,
                          long m)
    {

        // Base cases
        if (n == 0)
            return 1;
        if (n == 1)
            return (1 + r) % m;

        long ans;

        // If n is odd
        if (n % 2 == 1)
        {
            ans = (1 + r) *
                    SumofGP((r * r) % m,
                            (n - 1) / 2, m);
        }
        else
        {
            // If n is even
            ans = 1 + (r * (1 + r) *
                    SumofGP((r * r) % m,
                            (n / 2) - 1, m));
        }

        return (ans % m);
    }
    public static void main(String args[])
    {
        int a, r, n, m;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        r = s.nextInt();
        n = s.nextInt();
        m = s.nextInt();

        System.out.println(gp(a, r, n, m) + "\n" );
    }
}
