package com.company;

import java.util.Scanner;

public class Maximum_in_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("1");
        } else {
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                arr[0][i] = 1;
                arr[i][0] = 1;
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
            System.out.println(arr[n - 1][n - 1]);
        }
    }
}
