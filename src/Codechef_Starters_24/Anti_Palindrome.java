package Codechef_Starters_24;

import java.util.Scanner;

public class Anti_Palindrome {
    static String answer = "";
    static void printDistinctPermutn(String str,
                                     String ans)
    {

        // If string is empty
        if (str.length() == 0 && check(ans , ans.length())) {

            // print ans
            answer = ans;
            return;
        }

        // Make a boolean array of size '26' which
        // stores false by default and make true
        // at the position which alphabet is being
        // used
        boolean alpha[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // If the character has not been used
            // then recursive call will take place.
            // Otherwise, there will be no recursive
            // call
            if (alpha[ch - 'a'] == false)
                printDistinctPermutn(ros, ans + ch);
            alpha[ch - 'a'] = true;
        }
    }

    public static boolean check(String str , int N) {
        for (int i = 0; i < N; i++) {
            int val = N - i - 1;
            if (str.charAt(i) == str.charAt(val))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            int N = sc.nextInt();
            String str = sc.next();
            printDistinctPermutn(str , "");
            if(answer.length() > 0){
                System.out.println("YES");
                System.out.println(answer);
            }
            else
                System.out.println("NO");
            answer = "";
        }
    }
}
