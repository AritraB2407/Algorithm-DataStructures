package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    Queue<Character> q = new LinkedList<>();
    public void checkPalindrome(String input) {

        //Write your code here
        boolean palindrome = true;
         for(int i = 0; i<input.length();i++)
             push(input.charAt(i));
        for(int i = 0; i<input.length();i++) {
            if (!(pop() == input.charAt(i))) {
                palindrome =  false;
                break;
            }
        }
        if(palindrome)
        System.out.println("The given input is a palindrome.");
        else
            System.out.println("The given input is not a palindrome.");
    }
    void push(char k){
        int size = q.size();
    q.add(k);

    for(int i = 0;i<size;i++) {
        char temp = q.remove();
        q.add(temp);
    }
    }
    char pop(){
        if(!q.isEmpty()){
            char x = q.remove();
            return x;
        }
        return '1';
    }
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        Scanner in = new Scanner(System.in);
        String inputString = in .nextLine();
        obj.checkPalindrome(inputString);

    }
}
