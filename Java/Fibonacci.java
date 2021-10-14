package com.lev;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print(a+" "+b+" ");
        while(count<n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
            System.out.print(b+" ");
        }

    }
}
