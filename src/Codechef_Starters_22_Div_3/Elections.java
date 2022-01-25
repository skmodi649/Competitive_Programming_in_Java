package Codechef_Starters_22_Div_3;

import java.util.Scanner;

public class Elections {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t >= 1 && t <= 500){
            for(int a = 1 ; a <= t ; a++){
                int xa = sc.nextInt();
                int xb = sc.nextInt();
                int xc = sc.nextInt();
                if(xa > 50)
                    System.out.println("A");
                else if(xb > 50)
                    System.out.println("B");
                else if(xc > 50)
                    System.out.println("C");
                else
                    System.out.println("NOTA");
            }
        }
    }
}
