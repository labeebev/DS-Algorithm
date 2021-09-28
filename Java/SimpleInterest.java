package com.lev;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        float p = input.nextFloat();
        System.out.print("Rate of Interest in % : ");
        float r = input.nextFloat();
        System.out.print("Time (in years) : ");
        float t = input.nextFloat();
        float s = (p*r*t)/100 ;
        System.out.println("Simple Interest : "+s);

    }
}
