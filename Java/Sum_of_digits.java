package com.lev;

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        int total=0;
        int r;
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        while (temp != 0){
            r = temp % 10;
            total = total +r;
            temp=temp/10;
        }
        System.out.println(total);
    }
}
