package Codechef_Starters_23;

import java.util.Scanner;

public class MAXVAC {
    public static int zerocount(String str) {
        int l = str.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if (ch == '0')
                count++;
            else
                count += 0;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t >= 1 && t <= 1000) {
            for (int a = 1; a <= t; a++) {
                int count = 0;
                int n = sc.nextInt();
                int x = sc.nextInt();
                int len = x;
                String binary = sc.next();
                String pattern = "";
                while (x > 0) {
                    pattern = pattern + "0";
                    x--;
                }
                // System.out.println(pattern);
                int k = 0;
                int i = 0;
                while(i <= n){
                    String sub = "";
                    if(i+len <= n){
                        sub = binary.substring(i, i + len);}
                            if (sub.equals(pattern)) {
                                count++;
                                i = i + len;
                            }
                            else if (zerocount(sub) == len - 1 && k == 0) {
                                int index = sub.indexOf('1');
                                char before = binary.charAt(index + i - 1);
                                char after = binary.charAt(index + i + 1);
                                if(before == '0' && after == '0') {
                                    i = i + len;
                                    k = 1;
                                    count++;
                                }
                                else{
                                    i++;}
                            }
                            else if(zerocount(sub) == len - 1 && k == 1){
                                i++;
                            }
                            else{
                                i++;
                            }
                    }
                System.out.println(count);
            }
        }
    }
}
