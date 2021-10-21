package com.lev;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(i < n){
            if(n % i == 0){
                total = total + i;
            }
            i++;
        }
        if(total == n){
            System.out.println(n+" is perfect");
        }else{
            System.out.println(n+" is not perfect");
        }
    }
}
