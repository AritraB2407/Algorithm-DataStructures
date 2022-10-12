package HashMap;

import java.util.*;

public class FirstUniqueCharacter {
    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);

        //storing the input string to String variable "str"
        String str = in.nextLine();
        //write your code here
        String [] uni = str.split("");
        Map<String,Integer> uniqMap = new LinkedHashMap<>();
        int flag = -1;
        for(String s : uni)
            if(uniqMap.get(s) == null){
                uniqMap.put(s,1) ;
            }else {
                uniqMap.put(s,uniqMap.get(s)+1);
            }
        for(String s:uniqMap.keySet())
        if(uniqMap.get(s)<2){
            System.out.println(s);
            flag = 1;
            break;
        }
        if(flag < 1){
            System.out.println(flag);
        }
    }
}
