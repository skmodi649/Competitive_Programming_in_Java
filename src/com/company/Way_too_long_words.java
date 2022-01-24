package com.company;

import java.util.Scanner;

public class Way_too_long_words {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t >= 1 && t <= 100){
            for(int a = 1 ; a <= t ; a++){
                String word = sc.next();
                int l = word.length();
                if(l <= 10){
                    System.out.println(word);
                }
                else{
                    int num = l - 2;
                    String add = String.valueOf(num);
                    String naya = word.charAt(0) + add + word.charAt(l - 1);
                    System.out.println(naya);
                }
            }
        }
    }
}
