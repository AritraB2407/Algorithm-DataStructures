package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackWithQueueBetterApproach {


        /*implementing queue using linked list */
        Queue< Integer > q = new LinkedList< Integer >();

        /* Push operation of stack using queue*/
        void push(int x) {

            int size = q.size();

            /* Add new element in the queue */
            q.add(x);

            /* Pop (or Dequeue) all previous elements and put them after current element */

            for (int i = 0; i < size; i++) {
                /* this will remove the head element and add it to the tail element */
                int temp= q.remove();
                q.add(temp);
            }
        }

        /*Removes the top element of the stack*/

        int pop() {
            if (q.isEmpty()) {
                System.out.println("Stack is empty");
                System.exit(0);
            }
            int x = q.remove();
            return x;
        }


        /*Returns the element at the top of the stack */
        int top() {
            if (q.isEmpty()) {
                System.out.println("Stack is empty");
                System.exit(0);
            }
            return q.peek();
        }


        public static void main(String[] args) {
            StackWithQueueBetterApproach obj = new StackWithQueueBetterApproach();
            Scanner in = new Scanner(System.in);

            /*Enter the number of elements you want to add in the stack */

            int n = in .nextInt();

            /*Enter the elements of the stack */
            for (int i = 0; i < n; i++) {
                obj.push( in .nextInt());
            }

            System.out.println(obj.top());
            obj.pop();
            System.out.println(obj.top());
        }
    }

