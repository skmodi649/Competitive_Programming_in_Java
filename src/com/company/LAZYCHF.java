package com.company;

import java.util.Scanner;

public class LAZYCHF {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a = 1 ; a <= t ; a++){
            int x = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            int take = x * m;
            int maxdelay = x + d;
            int val = take < maxdelay ? take : maxdelay;
            System.out.println(val);
        }
    }
}
