package Recursion.Backtracking;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        printOneToN(n,n);
    }

    private static void printOneToN(int i,int n) {
        if(i<1)
            return;
        printOneToN(i-1,n);
        System.out.println(i);
    }
}
