package HashMap;

import java.util.Scanner;

public class SymetricUsingArray {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        // Write your code here
        for (int i = 0; i < n; i++) {
            int first1 = arr[i][0];
            int second1 = arr[i][1];
            for(int j = i+1; j<n;j++){
                int first2 = arr[j][0];
                int second2 = arr[j][1];
                if(first1 == second2 && second1 == first2){
                    System.out.println(first1+" "+second1);
                }
            }
        }

    }

}
