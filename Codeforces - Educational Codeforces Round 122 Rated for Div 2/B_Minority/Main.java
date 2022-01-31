//  B. Minority

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a = 1 ; a <= t ; a++){
            String binary = sc.next();
            int max = 0;
            for(int i = 0 ; i < binary.length() ; i++){
                int min = 0 , zeros = 0 , ones = 0;
                for(int j = i ; j < binary.length() ; j++) {
                    if(binary.charAt(j) == '0')
                        zeros++;
                    else
                        ones++;
                }
                if (zeros != ones) {
                    min = zeros > ones ? ones : zeros;
                    if (min > max)
                        max = min;
                }
            }
            System.out.println(max);
        }
    }
}