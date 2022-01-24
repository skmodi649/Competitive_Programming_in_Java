package com.company;

import java.util.Scanner;

public class B_Ordinary_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t >= 1 && t <= 10000) {
            for (int a = 1; a <= t; a++) {
                int num = sc.nextInt();
                if(num >= 1 && num <= 9){
                    System.out.println(num);}
                else{
                    int L = 1;
                    int tmp = 0, ans = 0 , R = num;

                   int n = String.valueOf(num).length();

                    for(int i = 0; i < n; i++)
                    {

                        // tmp has all digits as 1
                        tmp = tmp * 10 + 1;

                        // For each multiple of tmp
                        // in range 1 to 9, check if
                        // it present in range [L, R]
                        for(int j = 1; j <= 9; j++)
                        {
                            if (L <= (tmp * j) && (tmp * j) <= R)
                            {
                                // Increment the required count
                                ans++;
                            }
                        }
                    }
                    System.out.println(ans);
                }
            }
        }
    }
}
