package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class SortingStackWithStack {
    // This function returns the sorted stack
    public static Stack < Integer > sortStack(Stack < Integer > input) {
        //write your code here
        Stack<Integer> tempStack = new Stack<Integer>();
        while(!input.isEmpty()) {
            int tempVar = input.pop();
            while (!input.isEmpty() && tempVar < input.peek()) {
                tempStack.push(input.pop());
            }
            tempStack.push(tempVar);
        }
        return  tempStack;
        }


    public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
        //write your code here
      //  System.out.println(sortedStack);
            if (!sortedStack.isEmpty()) {
                while(sortedStack.size()>k){
                    sortedStack.pop();
                }
                System.out.println(sortedStack.peek());
            }
        }

    public static void main(String args[]) {
        Stack< Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add( in .nextInt());
        }

        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }

        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }

        // This is the temporary stack

        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);

    }
}
