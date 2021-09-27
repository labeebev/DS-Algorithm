package com.lev;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
