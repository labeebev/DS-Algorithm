package com.lev;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        System.out.print("Enter number :");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int res = 0;
        while(n!=0){
            int r = n % 10;
            res = res * 10 + r;
            n = n / 10;
        }
        System.out.print(res);
    }
}
