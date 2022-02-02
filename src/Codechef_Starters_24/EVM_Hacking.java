package Codechef_Starters_24;

import java.util.Scanner;

public class EVM_Hacking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 1 ; x <= t ; x++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int votes = (p+q+r)/2;
            if((p + b + c) > votes)
                System.out.println("YES");
            else if((a + q + c) > votes)
                System.out.println("YES");
            else if((a + b + r) > votes)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
