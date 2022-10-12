package Recursion;

public class PrintNTo1 {
    public static void main(String[] args) {
        int i = 1;
        int n = 10;
        printNToOne(i,n);
    }

    private static void printNToOne(int i, int n) {
        if(n<i)
            return;
        System.out.print(n+" ");
        printNToOne(i, n-1);
    }
}
