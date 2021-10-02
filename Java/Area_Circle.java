package com.lev;

import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        System.out.print("Enter the radius : ");
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        float res = (float) (Math.PI * r * r);
        System.out.println("Area : "+res);
    }
}
