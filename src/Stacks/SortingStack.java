package Stacks;

import java.util.*;

public class SortingStack {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        // Write your code here
        ArrayList<Integer> arrList = new ArrayList<>();
            while(!stack.empty()){
                arrList.add(stack.pop());
            }
        Collections.sort(arrList);

        for(int s:arrList)
            stack.push(s);

        System.out.println(stack);
    }
    }

