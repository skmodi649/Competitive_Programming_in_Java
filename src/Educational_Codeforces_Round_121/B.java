package Educational_Codeforces_Round_121;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t >= 1 && t <= 10000) {
            for (int a = 1; a <= t; a++) {
                int n = sc.nextInt();
                String num = Integer.toString(n);
                if (num.length() == 1) {
                    System.out.println(num);
                } else {
                    String naya = "";
                    int max = 0;
                    for (int i = 0; i < num.length() - 1; i++) {
                        int val1 = num.charAt(i) - '0';
                        int val2 = num.charAt(i + 1) - '0';
                        String got = String.valueOf(val1 + val2);
                        naya = num.substring(0, i) + got + num.substring(i + 2, num.length());
                        int number = Integer.parseInt(naya);
                        if (number > max)
                            max = number;
                    }
                    System.out.println(max);
                }
            }
        }
    }
}
