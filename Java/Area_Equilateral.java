package com.lev;

import java.util.Scanner;

public class Area_Equilateral {
    public static void main(String[] args) {
        System.out.print("Enter side :");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float area =(float) Math.sqrt(3)*a*a/4;
        System.out.println("Area : "+area);
    }
}
