package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ElementAtIndex {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        printFifthElementFromStart(queue);
    }

    // Method to print the fifth element from the head of the queue
    static void printFifthElementFromStart(Queue<Integer> queue) {
        // Write your code here
        if(queue.size()<5){
            System.out.println("There are not enough elements in the queue");
            return;
        }

        for(int i = 1;i<5;i++)
          queue.remove();
        System.out.println(queue.element());
    }
}
