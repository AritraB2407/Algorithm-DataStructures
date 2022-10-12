package Stacks;

import java.util.Scanner;
import java.util.Stack;

class Source{

    static Stack<Integer> stack = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
    public void enQueue(int newData){

        while (!stack.isEmpty())
        {
            stack2.push(stack.pop());
        }

        stack.push(newData);
        while (!stack2.isEmpty())
        {
            stack.push(stack2.pop());
        }
    }

    public void deQueue(){
        if(stack.isEmpty()){
            System.out.println("No elements left");
            return;
        }
        if(stack.size() == 1){
            int element = stack.pop();
            System.out.println(element);
            return;
        }
        int element = stack.peek();
        stack.pop();
        System.out.println(element);
    }

}


public class ImplementQueue{

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        Source obj = new Source();
        int n=in.nextInt();
        for(int i=0;i<n;i++) {
            obj.enQueue(in.nextInt());

        }
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
    }
}
