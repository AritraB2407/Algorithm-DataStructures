package Recursion;

import java.util.Scanner;

public class SumOfN {
    public static int sum(int n){
        //write the logic here
        if(n==0)
            return n;
        else
            return (sum(n-1)+n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            int value = SumOfN.sum(n);
            System.out.print(value);
        }
        else{
            System.out.println("Enter a natural number");
        }
    }
}
