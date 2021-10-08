package com.lev;

import java.util.Scanner;

public class Area_Parallelogram {
    public static void main(String[] args) {
        System.out.print("Enter base and height : ");
        Scanner in = new Scanner(System.in);
        float b = in.nextFloat();
        float h = in.nextFloat();
        float area = b * h;
        System.out.println("Area : "+area);
    }
}
