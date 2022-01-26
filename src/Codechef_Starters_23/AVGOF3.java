package Codechef_Starters_23;

import java.util.Scanner;

public class AVGOF3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t >= 1 && t <= 100) {
            for (int a = 1; a <= t; a++) {
                int x = sc.nextInt();
                int val = x * 3;
                int a1 = 0 , a2 = 0 , a3 = 0;
                for(int k = 1 ; k <= 1000 ; k++){
                    a1 = k;
                    a2 = k + 1;
                    a3 = k + 2;
                    int sum = a1 + a2 + a3;
                    if(sum == val)
                        break;
                }
                System.out.println(a1+" "+a2+" "+a3);
            }
        }
    }
}
