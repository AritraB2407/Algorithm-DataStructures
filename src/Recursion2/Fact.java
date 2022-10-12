package Recursion2;

public class Fact {
    public static void main(String[] args) {
        int fact = fact(5);
        System.out.println(fact);
    }

    public static int fact(int i) {
        if(i<=1){
            return 1;
        }
        return (i*fact(i-1));
    }


}
