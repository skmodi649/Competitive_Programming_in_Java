package Codechef_Starters_23;

import java.util.Scanner;

public class CHFPROFIT {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t >= 1 && t <= 100){
            for(int a=1 ; a<=t ; a++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                int cp = x*y;
                int sp = x*z;
                int profit = sp - cp;
                System.out.println(profit);
            }
        }
    }
}
