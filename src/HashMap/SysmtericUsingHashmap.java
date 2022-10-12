package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class SysmtericUsingHashmap {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        HashMap<Integer, Integer> symMap = new HashMap<>();
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
            int key = arr[i][0];
            int value = arr[i][1];
            if (symMap.get(value) != null && symMap.get(value) == key) {
                System.out.println(key + "," + value);
            } else {
                symMap.put(key, value);
            }

        }

    }
}
