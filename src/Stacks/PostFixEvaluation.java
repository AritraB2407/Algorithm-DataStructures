package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class PostFixEvaluation {
    static int precedence(char c)
    {
        switch (c)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static Boolean isOperand(char c)
    {
        // If the character is a digit
        // then it must be an operand
        if (c >= 48 && c <= 57)
            return true;
        else
            return false;
    }
    static double evaluatePostfix(String exp)
    {
        //create a stack
        Stack<Double> s = new Stack<>();

        // Scan all characters one by one
        for(int i=exp.length()-1;i>0;i--)
        {
            char ch=exp.charAt(i);
            if (isOperand(exp.charAt(i)))
                s.push((double)(exp.charAt(i) - 48));
            else {

                // Operator encountered
                // Pop two elements from Stack
                double val1 = s.peek();
                s.pop();
                double val2 = s.peek();
                s.pop();

                switch(ch)
                {
                    case '+':
                        s.push(val2+val1);
                        break;

                    case '-':
                        s.push(val2- val1);
                        break;

                    case '/':
                        s.push(val2/val1);
                        break;

                    case '*':
                        s.push(val2*val1);
                        break;
                    case '(':
                    case ')':
                        s.pop();
                        break;
                }
            }
        }
        return s.peek();
    }
    public static void main(String arg[]) {
        Stack<Integer> s = new Stack<Integer>();
        Scanner in = new Scanner(System.in);

        String exp = in.nextLine();
        System.out.println(evaluatePostfix(exp));
    }

    }

