package Hashtable;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class BoardingPassProblem {
    public static void main(String[] args)
    {
        Hashtable<Integer,Integer> boardingPass= new Hashtable<Integer,Integer>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i:arr)
        {
            if(boardingPass.get(i) == null)
                boardingPass.put(i,1);
            else
                boardingPass.put(i,boardingPass.get(i)+1);
        }
        Set<Integer> keys = boardingPass.keySet();
        for(int key:keys){
            if(boardingPass.get(key) > 1)
            System.out.println(key);
        }


    }
}
