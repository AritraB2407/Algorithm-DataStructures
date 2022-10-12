package Recursion.Backtracking;

public class PrintNTo1 {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        printNToOne(i,n);
    }
    public static void printNToOne(int i,int n){
        if(i>n)
            return;
        printNToOne(i+1,n);
        System.out.println(i);
    }
}
