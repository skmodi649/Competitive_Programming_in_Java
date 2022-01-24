package com.company;

import java.util.Scanner;

public class A_Word_Capatilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char ch = word.charAt(0);
        if (Character.isLowerCase(ch)) {
            word = Character.toUpperCase(ch) + word.substring(1, word.length());
            System.out.println(word);
        } else {
            System.out.println(word);
        }
    }
}

