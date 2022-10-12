package Searching;

import java.util.*;

public class SearchingJava8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int key = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        search(array,key);
    }

    public static void search(int[] arr,int key) {
        int a =-1;
        List<Integer> myList = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            myList.add(arr[i]);
        }
        int foundIndex=myList.stream().
                filter(i -> key==myList.get(i)).findFirst().get();
        System.out.println(foundIndex+1);
    }


}