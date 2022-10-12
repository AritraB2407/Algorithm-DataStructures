package HashMap;

import java.util.*;

public class KeyValueAnagram {
    public static boolean check(String str1, String str2){
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        //Write your code here
        arrange(ch1);
        arrange(ch2);
        return Arrays.equals(ch1, ch2);
    }
    //Method to sort the character array
    public static void arrange(char[] ch){
        //Write your code here
        Arrays.sort(ch);
    }

    public static void main(String[] x){
        int count  = 0;
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
        }
        //Write your code here
        Set<String> ch = map.keySet();
        for(String s : ch){
            if(check(s,map.get(s))) {
                count++;
                System.out.println(s + ":" + map.get(s));
            }
        }
        if(count == 0){
            System.out.println("false");
        }
    }
}
