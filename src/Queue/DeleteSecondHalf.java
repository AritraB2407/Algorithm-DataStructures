package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeleteSecondHalf {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        deleteSecondHalf(queue);
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        // Write your code here
        Queue<Integer> tempqueue = new LinkedList<Integer>();
        //System.out.println(queue);
        int queueSize = 0;
        if(queue.size()%2 == 0){
            queueSize = queue.size()/2;
        }else{
            queueSize = (queue.size()/2)+1;
        }

        for(int i = 0;i<queueSize;i++){
            int k = queue.peek();
            tempqueue.add(k);
            queue.remove();
        }
        System.out.println(tempqueue);
    }
}
