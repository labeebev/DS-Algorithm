package com.lev;

import java.util.Scanner;

public class Checkprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        if (n <= 1) {
            System.out.println(n + " is neither prime nor composite");
        }
        else{
            int c = 2;
            while (c * c <= n) {
                if (n % c == 0) {
                    System.out.println(n + " is not a prime");
                    System.exit(0);
                }
                c++;
            }
            System.out.println(n + " is a prime");
        }
    }
}
