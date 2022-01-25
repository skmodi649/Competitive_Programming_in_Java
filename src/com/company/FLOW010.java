package com.company;

import java.util.Scanner;

public class FLOW010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t >= 1 && t <= 1000){
            for(int a = 1 ; a <= t ; a++){
                char ch = sc.next().charAt(0);
                if(ch == 'B' || ch == 'b')
                    System.out.println("BattleShip");
                else if(ch == 'C' || ch == 'c')
                    System.out.println("Cruiser");
                else if(ch == 'D' || ch == 'd')
                    System.out.println("Destroyer");
                else
                    System.out.println("Frigate");
            }
        }
    }
}
