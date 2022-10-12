package Recursion;

import java.util.Scanner;

public class Triangle
{
    public int trisum(int[] nums) {
        return findSum(nums,nums.length);
    }
    public int findSum(int[] a, int n){
        if(n == 1)
            return a[0];

        for(int i=0;i<n-1;i++){
            a[i] = (a[i] + a[i+1]);
        }
        return findSum(a,n-1);
    }
    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        Triangle task = new Triangle();
        System.out.println(task.trisum(arr));
    }
}

