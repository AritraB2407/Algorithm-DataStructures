package Misc;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println(evenSum(6));
    }
    public static int evenSum(int n) {


        /*In algorithm 1, for a given n value, the first if condition verifies whether
        the value is an even or an odd number.
        If it is an even number, it is added to the sum and recursively
        calls the function evenSum(n - 1).
                If it is an odd number, then it recursively
        calls the function evenSum(n - 1) and does not add the odd numbers.
                In algorithm 2, you use a formula (n/2)*(1+n/2) to
        calculate the sum of the even numbers.*/

        /*if(n <= 1)
            return 0;

        else if (n % 2 == 0)
            return (n + evenSum(n - 1));
        else
            return evenSum(n - 1);*/
        return (n/2)*(1 + n/2);
    }
}
