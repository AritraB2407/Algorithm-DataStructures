package Queue;

import java.util.*;
import java.util.stream.Collectors;

public class StackWithQueue {

    static Queue< Integer > q = new LinkedList< Integer >();

    /* Push operation of stack using queue*/
    void push(int x) {
        //write your code here
        q.add(x);
    }

    /*Removes the top element of the stack*/

    int pop() {
        //write your code here
        return q.remove();
    }


    /*Returns the element at the top of the stack */
    int top() {
        //write your code here
        return q.element();
    }
    private void reverse() {
            List<Integer> collect = q.stream()
                    .collect(Collectors.toList());
            Collections.reverse(collect);
            while(!q.isEmpty())
                    pop();
            for(int k : collect)
                push(k);
        }

    public static void main(String[] args) {
        StackWithQueue obj = new StackWithQueue();
        Scanner in = new Scanner(System.in);

        /*Enter the number of elements you want to add in the stack */

        int n = in .nextInt();

        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            obj.push( in .nextInt());
        }
        if(q.isEmpty()){
            System.out.print("Stack is empty");
        } else{
            obj.reverse();
            System.out.println(obj.top());
            obj.pop();
            System.out.println(obj.top());
        }

    }


}
