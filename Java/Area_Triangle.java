package com.lev;

import java.util.Scanner;

public class Area_Triangle {
    public static void main(String[] args) {
        System.out.print("Enter 3 sides : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        float s = (a + b + c)/2;
        float area =(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("Area : "+area);
    }
}
