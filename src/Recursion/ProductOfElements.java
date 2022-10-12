package Recursion;

import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        RPRE(arr, n);
    }
    public static void RPRE(int arr[], int n){
        int[] result = new int[arr.length];
        for(int i = 0, tmp = 1; i < arr.length; i++) {
            result[i] = tmp;
            tmp *= arr[i];
        }
        for(int i = arr.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= arr[i];
        }
        for(int i = 0;i<result.length;i++) {
            System.out.print(result[i]+" ");
        }

    }
}
