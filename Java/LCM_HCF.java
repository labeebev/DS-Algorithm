package com.lev;

import java.util.Scanner;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int a = n1;
        int b = n2;
        int temp;
        int hcf;
        int lcm;
        while (b != 0){
            temp = b;
            b = a % b;
            a = temp;
        }
        hcf = a;
        lcm = n1 * n2 / hcf;
        System.out.println("LCM : "+lcm);
        System.out.println("HCF : "+hcf);
    }
}
