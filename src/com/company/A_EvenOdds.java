package com.company;

import java.util.Scanner;

public class A_EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        boolean res = false;
        long i, j;
        for (i = 1; i <= n; i = i + 2) {
            if (k == 1) {
                res = true;
                break;
            } else {
                k--;
            }
        }
        if (res) {
            System.out.println(i);
        } else {
            for (j = 2; j <= n; j = j + 2) {
                if (k == 1) {
                    System.out.println(j);
                    break;
                } else {
                    k--;
                }
            }
        }
    }
}
