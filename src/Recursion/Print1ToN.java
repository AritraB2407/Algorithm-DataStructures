package Recursion;

public class Print1ToN {
    public static void main(String[] args) {
        int i = 1;
        int n = 10;
        oneToN(i,n);
    }

    private static void oneToN(int i, int n) {
        if(i>n)
            return;
        System.out.print(i+" ");
        oneToN(i+1,n);
    }
}
