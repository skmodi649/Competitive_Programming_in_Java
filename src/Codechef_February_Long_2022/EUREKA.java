package Codechef_February_Long_2022;

import java.util.Scanner;

public class EUREKA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int a = 1; a <= t; a++) {
            int N = sc.nextInt();
            double val = N * 0.143;
            float x = (float) Math.pow(val , N);
            double floorval = Math.floor(x);
            if(x - floorval < 0.5)
                System.out.println((int)floorval);
            else
                System.out.println((int)(floorval + 1));
        }
    }
}