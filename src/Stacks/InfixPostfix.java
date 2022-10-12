package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InfixPostfix {

    static int precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);

        String exp = in.nextLine();
        StringBuilder output = new StringBuilder(new String(""));

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (precedence(c) > 0) {
                while (!s.isEmpty() && precedence(s.peek()) >= precedence(c)) {
                    output.append(s.pop());
                }
                s.push(c);
            } else if (c == ')') {
                char c1 = s.pop();
                while (c1 != '(') {
                    output.append(c1);
                    c1 = s.pop();
                }
            } else if (c =='('){
                s.push(c);
            } else {
                output.append(c);
            }
        }
        for(int i = 0; i<s.size();i++)
            output.append(s.pop());
            System.out.println(output);
    }
}