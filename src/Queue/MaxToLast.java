package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MaxToLast {
        static Queue<Integer> q = new LinkedList<Integer>();

        public static void func() {
            //Finding the maximum element
            int max = q.peek();
            for (int i = 0; i < q.size(); i++) {
                int del = q.remove();
                if (max < del) {
                    max = del;
                }
                q.add(del);
            }
            // Adding the maximum element to the end of the queue.
            int s = q.size();
            for (int i = 0; i < s; i++) {
                int del = q.remove();
                if (del != max) {
                    q.add(del);
                }
            }
            q.add(max);
        }

        public static void main(String arg[]) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                q.add(in.nextInt());
            }
            func();
            System.out.println(q);
        }
    }


