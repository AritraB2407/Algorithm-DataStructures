package Recursion;

import java.util.Scanner;

public class NobleInteger {
    static int nobleNum(int arr[], int n)
    {
        int min = arr[0];
        for(int i = 1 ; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
       return min==arr.length-1?1:-1;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(nobleNum(arr, n) + "\n" );
    }
}

