package com.lev;

import java.util.Scanner;

public class Smallest_largest {
    public static int smallest(int a, int b, int c){
        int sm = a;
        if(b < sm){
            sm = b;
        }
        if(c < sm){
            sm = c;
        }
        return sm;
    }
    public static int largest(int a, int b, int c){
        int lg = a;
        if(b > lg){
            lg = b;
        }
        if(c > lg){
            lg = c;
        }
        return lg;
    }

    public static void main(String[] args) {
        System.out.print("Enter 3 numbers : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int sm = smallest(a,b,c);
        int lg = largest(a,b,c);
        System.out.println("Largest : "+lg);
        System.out.println("Smallest : "+sm);
    }
}
