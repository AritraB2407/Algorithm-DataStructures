package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MaxFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.next();
        }
        findFrequency(arr);
    }

    private static void findFrequency(String[] arr) {
        int max  = 0;
        Map<String,Integer> frequencyMap = new HashMap<>();
            for(String s:arr){
                if(!frequencyMap.containsKey(s)){
                    frequencyMap.put(s,1);
                }else{
                    frequencyMap.put(s,frequencyMap.get(s)+1);
                }
            }
        System.out.println(frequencyMap);
            Set<String> freqSet = frequencyMap.keySet();
            for(String s : freqSet){
                if(frequencyMap.get(s) > max){
                    max = frequencyMap.get(s);
                }
            }
        System.out.println(max);
    }
}
