package Codechef_February_Long_2022;

import java.util.Scanner;

public class BINBASBASIC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int a = 1; a <= t; a++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int count = 0;
            String str = sc.next();
            for(int i = 0 ; i < N/2 ; i++){
                char ch1 = str.charAt(i);
                char ch2 = str.charAt(N-i-1);
                if(ch1 != ch2)
                    count++;
                else
                    count+=0;
            }
            if(K >= count){
                if((K-count)%2==0)
                    System.out.println("YES");
                else if(N%2!=0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else{
                System.out.println(("NO"));
            }
        }
    }
}
