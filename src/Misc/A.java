package Misc;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(indexValuMatch(array));
    }
    static int indexValuMatch(int [] array){
        int count =0;
        for(int i = 0 ; i<array.length;i++){
            if(array[i] == i+1)
                count++;
        }
        return count;
    }
}
