package Sorting;

import java.util.Scanner;

public class InsertionSortNames {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }
        insertSortasc(firstNames);
        for (int i = 0; i < firstNames.length; ++i) {
            System.out.println(firstNames[i] + " ");
        }
        insertSortdesc(lastNames);
        for (int i = 0; i < lastNames.length; ++i) {
            System.out.println(lastNames[i] + " ");
        }
    }

    private static void insertSortdesc(String[] lastNames) {
        for( int i =1 ;i<lastNames.length;i++){
            String v = lastNames[i];
            int  j= i;

            while(j>=1 && lastNames[j-1].compareTo(v)<0){
                lastNames[j]=lastNames[j-1];
                j--;
            }

            lastNames[j]=v;
        }
    }

    private static void insertSortasc(String[] firstNames) {
        for( int i =1 ;i<firstNames.length;i++){
            String v = firstNames[i];
            int  j= i;

            while(j>=1 && firstNames[j-1].compareTo(v)>=0){
                firstNames[j]=firstNames[j-1];
                j--;
            }

            firstNames[j]=v;
        }
    }
}
