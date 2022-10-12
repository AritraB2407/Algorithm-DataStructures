package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class deleteFirstHalf {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack);
    }

    // Method to delete the first half of the elements from the bottom of the stackand print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        // Write your code here
        if(stack.isEmpty())
            return;
        int queueSize = 0;
        if(stack.size()%2 == 0){
            queueSize = stack.size()/2;
        }else{
            queueSize = (stack.size()/2)+1;
        }
            Stack<Integer> tempStack = new Stack<>();
            for (int i = 0; i < queueSize; i++) {
                int k = stack.peek();
                tempStack.push(k);
                stack.pop();
            }
            while(!stack.isEmpty()){
                stack.pop();
            }
            while(!tempStack.isEmpty()){
                stack.push(tempStack.peek());
                tempStack.pop();
            }
            System.out.println(stack);

    }
}