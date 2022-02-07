package com.company;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


// Remember that the class name should be "Main" and should be "public".
public class NUMGAME {
    // *************** Own devised algorithm(TLE) *************************
 /*   public static int divisor(int num){
        int val = 0;
        for(int i = 1 ; i < num ; i++){
            if(num % i == 0)
                val = i;
        }
        return val;
    }
    public static boolean isprime(int num){
        int c = 0;
        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0)
                c++;
        }
        if(c == 2)
            return true;
        else
            return false;
    } */
    // Efficient solution is based on the observation
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);
        int t = in.nextInt();
        for(int a = 1 ; a <= t ; a++){
            int count = 0;
            int n = in.nextInt();
        /*    if(n == 1)
                System.out.println("BOB");
            else if(n == 2)
                System.out.println("ALICE");
            else{
                while(n > 1){
                    n = n - divisor(n);
                    count++;
                }
                if(count % 2 == 0)
                    System.out.println("ALICE");
                else
                    System.out.println("BOB"); */

            if(n % 2 == 0)
                System.out.println("ALICE");
            else
                System.out.println("BOB");
            }
        }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

