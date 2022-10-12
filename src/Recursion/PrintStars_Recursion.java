package Recursion;

import java.util.Scanner;

public class PrintStars_Recursion {
    public static String func(int n) {
        //write your code here

        if(n==0)
            return "";

            String pattern = func(n-1);
            pattern = pattern+" *";
            System.out.println(pattern);
            return pattern;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n);
    }
}
