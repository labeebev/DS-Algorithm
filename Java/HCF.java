package com.lev;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int val;
        if(n1 > n2){
            val = n1;
        }else{
            val= n2;
        }
        while (true){
            if((val % n1 == 0) && (val % n2 == 0)){
                break;
            }else{
                val++;
            }
        }
        System.out.println("LCM : "+val);
    }
}
