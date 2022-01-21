package com.company;

import java.util.Scanner;

public class Watermelon_800 {
    public static void main(String[] abc){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if(w >= 1 && w <= 100){
            if(w % 2 != 0){
                System.out.println("NO");
            }
            else if(w == 2){
                System.out.println("N0");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
