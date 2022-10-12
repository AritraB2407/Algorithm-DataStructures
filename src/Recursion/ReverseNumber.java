package Recursion;

public class ReverseNumber {
    public static int c = 0;
    public static void main(String[] args) {
        function();
    }

    private static void function() {
        if(c == 4)
            return;
        System.out.println(c);
        c++;
        function();

    }
}
