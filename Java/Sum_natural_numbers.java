package com.lev;

import java.util.Scanner;

public class Sum_natural_numbers {
    public static int natural(int n){
        n = (n * (n + 1)/2);
        return n;
    }
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Sum of first "+ n +" natural numbers : "+natural(n));
    }
}
