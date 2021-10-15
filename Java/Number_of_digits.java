package com.lev;

import java.util.Scanner;

public class Number_of_digits {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = 0;
        while(n != 0){
            n = n / 10;
            temp++;
        }
        System.out.print(temp);
    }
}
