package Recursion;

import java.util.Scanner;

public class DuplicateArray {
    static int duplicate(int arr[], int n)

    {
        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length]
                    = arr[arr[i] % arr.length]
                    + arr.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr.length * 2) {
               // System.out.println(i + " ");
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(duplicate(arr, n));
    }
}
