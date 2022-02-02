package Codechef_Starters_24;

import java.util.Scanner;

public class Avoid_Contact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int a = 1; a <= t; a++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int normal = x - y;
            if(normal == x){
                System.out.println(x);
            }
            else if(normal == 0){
                System.out.println(x*2 - 1);
            }
            else{
                int Cseat = y * 2 - 2;
                int Nseat = normal + 2;
                System.out.println(Cseat + Nseat);
            }
        }
    }
}
