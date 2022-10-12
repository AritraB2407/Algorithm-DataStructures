package Misc;

import java.util.*;

public class CharactersInString {
    public static void main(String[] args) {
       // int[] CountArray = new int[26];
        String s;
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        String a[] = s.split("");
        List<String> list = Arrays.asList(a);
        //System.out.println(list);
        Collections.sort(list);
        Set<String> mySet = new TreeSet<>(list);
        mySet.stream()
                .map(str-> str+Collections.frequency(list, str))
                .forEach(System.out::print);
    }
}
