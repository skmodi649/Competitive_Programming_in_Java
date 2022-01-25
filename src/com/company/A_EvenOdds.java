package com.company;

import java.util.Scanner;

public class A_EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n % 2 == 0){
            if(k <= n / 2){
                long val = 1 + (k - 1) * 2;
                System.out.println(val);
            }
            else{
                long naya = k - n/2;
                long val = 2 + (naya - 1) * 2;
                System.out.println(val);
            }
        }
        else{
            long div = n / 2;
            div = div + 1;
            if(k <= div){
                long val = 1 + (k - 1) * 2;
                System.out.println(val);
            }
            else{
                long naya = k - div;
                long val = 2 + (naya - 1) * 2;
                System.out.println(val);
            }
        }
    }
}
