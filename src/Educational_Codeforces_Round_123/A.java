package Educational_Codeforces_Round_123;

import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            char first = str.charAt(0);
            if(Character.isUpperCase(first))
                System.out.println("NO");
            else{
                int keyr = str.indexOf('r');
                int keyb = str.indexOf('b');
                int keyg = str.indexOf('g');
                int doorr = str.indexOf('R');
                int doorb = str.indexOf('B');
                int doorg = str.indexOf('G');
                if(doorr > keyr && doorb > keyb && doorg > keyg)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
