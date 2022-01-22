package com.company;

import java.util.*;

public class Round_767_A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t >= 1 && t <= 100) {
            for (int x = 1; x <= t; x++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                if ((n >= 1 && n <= 100) && (k >= 1 && k <= 1000)) {
                    int[] require = new int[n];
                    int[] get = new int[n];
                    for (int i = 0; i < n; i++) {
                        require[i] = sc.nextInt();
                    }
                    for (int i = 0; i < n; i++) {
                        get[i] = sc.nextInt();
                    }
                    HashMap<Integer, Integer> hash = new HashMap<>();
                    for (int i = 0; i < n; i++) {
                        hash.put(require[i], get[i]);
                    }
                    ArrayList<Integer> sortKeys
                            = new ArrayList<Integer>(hash.keySet());
                    Collections.sort(sortKeys);
                    for (Integer s : sortKeys){
                        if(k >= s){
                            k = k + hash.get(s);
                        }
                    }
                    System.out.println(k);
                }
            }
        }
    }
}
