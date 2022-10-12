package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class LockAndKey {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        // get the number of keys
        int n = in.nextInt();

        char keys[] = new char[n];
        char locks[] = new char[n];

        // store all the keys to the array "keys"
        for (int i = 0; i < n; i++) {
            keys[i] = in.next(".").charAt(0);
        }
        in.nextLine();

        //store all the locks to the array "locks"
        for (int i = 0; i < n; i++) {
            locks[i] = in.next(".").charAt(0);
        }
        HashMap<Character,Integer>lockMap = new HashMap<>();
        for(int i = 0; i<n;i++){
            lockMap.put(locks[i],i);
        }
        for(int i = 0; i<n;i++){
            if(lockMap.get(keys[i])!=null){
                locks[i] =  keys[i];
            }else{
                System.out.println("Not Possible");
                return;
            }
        }
        for(int i = 0; i<n;i++){
            System.out.println(locks[i]+" "+keys[i]);
        }
    }
}
