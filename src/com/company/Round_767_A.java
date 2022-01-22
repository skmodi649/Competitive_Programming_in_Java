package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Round_767_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t >= 1 && t <= 100){
            for(int x = 1 ; x <= t ; x++){
                ArrayList<Integer> list = new ArrayList<>();
                int n = sc.nextInt();
                int k = sc.nextInt();
                int val = 0;
                if((n >= 1 && n <= 100) && (k >=1 && k <= 1000)){
                int[] require = new int[n];
                int[] get = new int[n];
                for(int i = 0 ; i < n ; i++){
                    require[i] = sc.nextInt();
                }
                for(int i = 0 ; i < n ; i++){
                    get[i] = sc.nextInt();
                }
                for(int i = 0 ; i < n ; i++){
                    if((require[i] >= 1 && require[i] <= 1000) && (get[i] >= 1 && get[i] <= 1000)) {
                        if (k >= require[i]) {
                            k = k + get[i];
                            list.add(require[i]);
                            val++;
                        }
                    }
                }
                if(0 != val) {
                    int count = 0;
                    while (count < n) {
                        int c = 0;
                        for (int s = 0; s < n; s++) {
                            if (k >= require[s]) {
                                if ((require[s] >= 1 && require[s] <= 1000) && (get[s] >= 1 && get[s] <= 1000)) {
                                    if (!list.contains(require[s])) {
                                        k = k + get[s];
                                        list.add(require[s]);
                                        c++;
                                    }
                                }
                            }
                        }
                        if(c != 0)
                            count = 0;
                        else
                            count++;
                    }
                }
                    System.out.println(k);
                }
            }
        }
    }
}
