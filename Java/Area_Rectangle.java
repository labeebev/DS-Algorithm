package com.lev;

import java.util.Scanner;

public class Area_Rectangle {
    public static void main(String[] args) {
        System.out.print("Enter the sides : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Area : "+(a*b));
    }
}
