package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeueExample {
    public static Deque<Integer> deque = new LinkedList<Integer>();

    public static void add_atend(int data) {
        //write the code to add 'data' at the end of the deque.
        deque.addLast(data);
    }

    public static void add_athead(int data) {
        //write the code to add 'data' to the front of the deque.
        deque.addFirst(data);

    }

    public static void delete_atend() {
        //write code to delete an element at the end of the deque
        if(deque.isEmpty()){
            System.out.println("Not possible");
            System.exit(0);
        }
        deque.removeLast();
    }

    public static void delete_athead() {
        if(deque.isEmpty()){
            System.out.println("Not possible");
            System.exit(0);
        }
        //write code to delete an element in the front of the deque.
        deque.removeFirst();
    }

    public static int return_head() {
        //write code to return the head of the deque.
        return deque.getFirst();
    }

    public static int return_tail() {
        //write code to return tail of the deque.
        return deque.getLast();
    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int value;
        for (int j = 0; j < n; j++) {
            value = in.nextInt();
            switch (value) {
                case 1:
                    add_atend(in.nextInt());
                    break;
                case 2:
                    add_athead(in.nextInt());
                    break;
                case 3:
                    delete_atend();
                    break;
                case 4:
                    delete_athead();
                    break;
                case 5:
                    System.out.println(return_head());
                    break;
                case 6:
                    System.out.println(return_tail());
                    break;
            }
        }
        System.out.println(deque);
    }
}
