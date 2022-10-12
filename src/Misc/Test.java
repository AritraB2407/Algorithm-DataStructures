package Misc;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        factorial1(5);
    }
    public static void factorial1(int n) {

        int[] factorials = new int[n + 1];
        Arrays.fill(factorials, 1);
        for (int i = 0; i <= n - 1; i++) {
            factorials[i + 1] = (i + 1) * factorials[i];
        }
        System.out.println(factorials[n]);
    }
}
