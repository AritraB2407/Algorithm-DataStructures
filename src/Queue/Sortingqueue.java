package Queue;

import java.util.*;

public class Sortingqueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
    }

    // Method to sort the queue
    static void sort(Queue<Integer> queue) {
        if(queue.isEmpty())
            return;
        // Write your code here
        ArrayList<Integer> arrList = new ArrayList<>();
        while(!queue.isEmpty()){
            arrList.add(queue.remove());
        }
        Collections.sort(arrList);

        for(int s:arrList)
            queue.add(s);
        System.out.println(queue);
    }
}
