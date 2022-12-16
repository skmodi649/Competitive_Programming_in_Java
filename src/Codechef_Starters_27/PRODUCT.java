package Codechef_Starters_27;

import java.util.Scanner;

public class PRODUCT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int B = sc.nextInt();
            int C = sc.nextInt();
            int A = 1;
            int val = B * A;
            while(val % C != 0){
                A++;
                val = B * A;
            }
            System.out.println(A);
        }
    }
}
