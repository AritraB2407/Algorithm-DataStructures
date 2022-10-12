package Stacks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseSecondHalf {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        // Write your code here
        ArrayList<Integer> arrList = new ArrayList<>();
        double halfOfStack = Math.floor(stack.size()/2);
        if(halfOfStack%2 == 0){
            while(!stack.empty() && stack.size() > halfOfStack){
                arrList.add(stack.pop());
            }
        }else{
            while(!stack.empty() && stack.size() > halfOfStack+1){
                arrList.add(stack.pop());
            }
        }
        for(int s:arrList)
            stack.push(s);

        System.out.println(stack);
    }
}
