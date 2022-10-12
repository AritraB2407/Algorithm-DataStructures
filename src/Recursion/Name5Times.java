package Recursion;

public class Name5Times {
    //static int count = 0;
    public static void main(String[] args) {
        int i = 1;
        int n  = 5;
        printName(i,n);
    }

    private static void printName(int start, int end) {
        if(start > end)
            return;
        System.out.println("Aritra");
        printName(start+1,end);
    }
}
