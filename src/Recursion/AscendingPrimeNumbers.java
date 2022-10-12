package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AscendingPrimeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Loop that iterates from 1 to n.
        for(int i = 1; i <= n; i++){
            //variable that keeps track of the current number as prime or not.
            boolean isPrime = true;
            for(int j = i-1; j >=2; j--){

                //If the number can divide then it cannot be prime.
                //So terminate the loop by marking it.
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            //If the variable is not modified by the inner loop then it is prime.
            if(isPrime)
                System.out.print(i+" ");
        }
    }
}
