package Educational_Codeforces_Round_122;

import java.util.Scanner;

public class Minority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a = 1 ; a <= t ; a++){
            String binary = sc.next();
            int max = 0;
            for(int i = 0 ; i < binary.length() ; i++){
                int min = 0;
                for(int j = i+1 ; j < binary.length() ; j++) {
                    String substr = binary.substring(i, j);
                    int zeros = 0;
                    for (int k = 0; k < substr.length(); k++) {
                        if (substr.charAt(k) == '0')
                            zeros++;
                    }
                    int ones = substr.length() - zeros;
                    if (zeros != ones) {
                        min = zeros > ones ? ones : zeros;
                        if (min > max)
                            max = min;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
