package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class StackContainSame {
    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student
        if(sequence1.isEmpty() || sequence2.isEmpty())
            return true;
        if(sequence1.isEmpty() && sequence2.isEmpty())
            return true;
        if(sequence1.size() < sequence2.size()){
            while(!sequence1.isEmpty()){
                if(sequence2.contains(sequence1.pop())){
                    return true;
                }
                return false;
            }
        }else if(sequence2.size() < sequence1.size()){
            while(!sequence2.isEmpty()){
                if(sequence1.contains(sequence2.pop())){
                    return true;
                }else{
                    return false;
                }
            }
        }else{
            while(!sequence2.isEmpty()){
                if(sequence1.contains(sequence2.pop())){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
    }
}
