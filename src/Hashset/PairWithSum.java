package Hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PairWithSum {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        // number of the elements
        int n = in.nextInt();

        int array[] = new int[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }

        // getting the target sum from input
        int targetSum = in.nextInt();
        boolean flag = false;
        //write your code here
        Set<Integer> sumSet = new TreeSet<>();
        for(int i:array)
            sumSet.add(i);

        for(int i = 0;i<n;i++){
            int diff = targetSum - array[i];
            if(sumSet.contains(diff)){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
