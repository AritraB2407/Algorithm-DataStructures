package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueLinkedList {
    public static void main(String[] args) {
        Queue numbers = new LinkedList();
        List(numbers);

        // Write your code here
        // You should only add some numbers, dequeue, or peek to change the elements in the queue
        // so that the queue becomes [1,4,9,14,15]
        numbers.remove();
        numbers.remove();
        numbers.add(1);
        numbers.add(numbers.element());
        numbers.remove();
        numbers.add((int)(numbers.element())+3);
        numbers.remove();
        numbers.add((int)numbers.element()+6);
        numbers.remove();
        numbers.remove();
        numbers.add((int)(numbers.element())+3);
        numbers.remove();

        System.out.println(numbers);
    }

    public static void List(Queue numbers) {
        int i = 0;
        while(i <= 12) {
            if(i%2==0) {
                numbers.add(i);
            }
            i++;
        }
    }
}
