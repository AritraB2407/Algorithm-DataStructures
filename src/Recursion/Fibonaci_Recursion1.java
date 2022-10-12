package Recursion;

public class Fibonaci_Recursion1 {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    private static int fibonacci(int i) {
        /*if(i<2)
            return 1;
        else*/
            System.out.println(i);
            return (fibonacci(i-1) + fibonacci(i-2))%10;
    }
}
