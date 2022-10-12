package Misc;

public class TwoPersonWillMeet {
    public static void main(String[] args) {
        int p1 = 6, j1 = 3, p2 = 8, j2 = 2;
        if(check(p1, j1, p2, j2))
            System.out.println("YES");
        else
            System.out.println("Both will not meet at any point");
    }
    public static boolean check(int p1, int s1, int p2, int s2) {


            int max = Integer.MAX_VALUE;
            while (p1 < max && p2 < max) {
                if (p1 == p2)
                    return true;
                p1 += s1;
                p2 += s2;
            }
            return false;
        }

        /*return ( (j1 > j2 && ( ((p2 - p1) % (j1 - j2)) == 0)) || (j2 > j1 && ( ((p1 - p2) % (j2 - j1)) == 0)) );*/
    }

