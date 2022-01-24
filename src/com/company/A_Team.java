package com.company;

import java.util.Scanner;

public class A_Team {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t >= 1 && t <= 1000){
            int count = 0;
            for(int a = 1 ; a <= t ; a++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                if((x == 1 && y == 1) || (y == 1 && z == 1) || (x == 1 && z == 1) || (x == 1 && y == 1 && z == 1))
                    count++;
                else
                    count+=0;
            }
            System.out.println(count);
        }
    }
}
