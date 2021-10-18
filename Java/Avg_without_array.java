package com.lev;

import java.util.Scanner;

public class Average_without_array {
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Enter the elements: ");
        int temp = 0;
        int sum = 0;
        while(temp != n){
            int val = in.nextInt();
            sum = sum + val;
            temp++;
        }
        float avg = sum / n;
        System.out.print("Average : "+avg);
    }
}
