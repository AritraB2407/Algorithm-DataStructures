package Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void insertSort(int[] arr){

        for( int i =1 ;i<arr.length;i++){
            int v = arr[i];
            int  j= i;

            while(j>=1 && arr[j-1]>v){
                arr[j]=arr[j-1];
                j--;
            }

            arr[j]=v;
        }
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        insertSort(array);
    }
}
