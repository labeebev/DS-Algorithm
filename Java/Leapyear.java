package com.lev;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int yr = input.nextInt();
        if(((yr % 4 == 0) && (yr % 100 != 0) || (yr % 400 == 0))){
            System.out.println(yr + " is a leap year");
        }else{
            System.out.println((yr + " is not a leap year"));
        }
    }
}
