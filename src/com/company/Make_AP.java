package com.company;

import java.util.Scanner;

public class Make_AP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t >= 1 && t <= 10000){
            for(int x = 1 ; x <= t ; x++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if((b - a) == (c - b)){
                    System.out.println("YES");
                }
                else if(a == b){
                    if((c < a) && (c % a == 0))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else if(a == c){
                    if((b < a) && (b % a == 0))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else if(b == c){
                    if((a < b) && (a % c == 0))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                    }
                }
            }
        }
    }
