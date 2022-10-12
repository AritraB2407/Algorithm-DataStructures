package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class AddBinary {
    static String generatePrintBinary(int n) {
        String s ="";
        Stack<Integer> stack = new Stack<Integer>();

        while(n>0)
        {
            int r = n%2;
            stack.push(r);
            n/=2;
        }

        while (!(stack.isEmpty() ))
        {
            s = s+stack.pop().toString();
        }
        return s;

    }
    public String binaryAddition(String s1, String s2) {
        String res = "";

        // Initializing digit sum
        int d = 0;

        int k = s1.length() - 1, l = s2.length() - 1;
        while (k >= 0 || l >= 0 || d == 1) {
            d += ((k >= 0) ? s1.charAt(k) - '0' : 0);
            d += ((l >= 0) ? s2.charAt(l) - '0' : 0);

            res = (char)(d % 2 + '0') + res;

            // Computing carry
            d /= 2;

            // Moving to the next digits
            k--;
            l--;
        }

        return res;
    }
    public static void main(String[] args) {
        AddBinary obj = new AddBinary();
        String first = "";
        String second = " ";
        String result = " ";
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        first = obj.generatePrintBinary(n);
        int m = in.nextInt();
        second = obj.generatePrintBinary(m);
        result = obj.binaryAddition(first, second);

       System.out.println(result);
    }
}
