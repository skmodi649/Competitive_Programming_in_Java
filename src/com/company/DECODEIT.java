package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DECODEIT {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
        if(t >= 1 && t <= 10){
            for(int a = 1 ; a <= t ; a++){
                String binary = br.readLine();
                String finalstring = "";
                int l = binary.length();
                int k = 0 , start = 0 , end = 0;
                for(int i = 0 ; i < l ; i++){
                    String section = binary.substring(i , i + 4);
                    if(section.equals("0000")){
                        finalstring = finalstring + "a";
                    }
                    else if(section.equals("1111")){
                        finalstring = finalstring + "p";
                    }
                    else{
                        char c1 = binary.charAt(0);
                        if(c1 == '0'){
                            start = 0;
                            end = 7;
                        }
                        else{
                            start = 8;
                            end = 15;
                        }
                        char c2 = binary.charAt(1);
                        if(c2 == '0'){
                            start = 0;
                            end = 3;
                        }
                        else{
                            start = 4;
                            end = 7;
                        }
                        char c3 = binary.charAt(2);
                        if(c3 == '0'){
                            start = 0;
                            end = 1;
                        }
                        else{
                            start = 2;
                            end = 3;
                        }
                    }
                }
            }
        }
    }
}
