package Hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, count = 0;
        n = in.nextInt();

        //array to store the input elements
        int[] array = new int[n];

        //storing the elements to the array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        // If the array is empty then print false and return
        if (n == 0) {
            System.out.println("false");
            return;
        }


        /* HashSet to store all the elements of the "array" */
        HashSet<Integer> hashSet = new HashSet<Integer>();

        /* Store all the elements of the "array" to the "hashSet" */
         for (int i = 0; i < n; i++)
            hashSet.add(array[i]);

        // Initialise the current element as array[0]
        int currentElement = array[0];

        // while "currentElement" present in "hashSet" do the following
        while (hashSet.contains(currentElement) == true) {

            // increment count by one
            count++;

            // decrement the "currentElement" by one
            currentElement--;
        }


        /*Now to check for the elements greater than the array[0]. So, modify the "currentElement" as array[0] + 1 */
        currentElement = array[0] + 1;

        // while "currentElement" present in "hashSet" do the following
        while (hashSet.contains(currentElement) == true) {

            // increment the "count" by one
            count++;

            // increment the "currentElement" by one
            currentElement++;
        }

        // Print true if the "count" is equal to the size of the "hashSet"
        if (count == (hashSet.size())) {
            System.out.println("true");
        }
        //Otherwise print false
        else
            System.out.println("false");
    }
}
