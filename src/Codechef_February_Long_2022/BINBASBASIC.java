package Codechef_February_Long_2022;

import java.util.Scanner;
class BINBASBASIC {
    public static boolean isPalin(String str){
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String rev = st.toString();
        if(rev.equals(str))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int a = 1; a <= t; a++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String str = sc.next();
            char[] arr = str.toCharArray();
            if(K == 0 && !isPalin(str)){
                System.out.println("NO");
            }
            else if(K == 0 && isPalin(str)){
                System.out.println("YES");
            }
            else if(isPalin(str) && K > 0){
                System.out.println("NO");
            }
            else {
                if (N % 2 == 0) {
                    int start = 0, end = N - 1;
                    while (K > 0) {
                        if(start < end) {
                            char ch1 = arr[start];
                            char ch2 = arr[end];
                            if (ch1 != ch2) {
                                if (ch1 == '1')
                                    arr[start] = '0';
                                else
                                    arr[start] = '1';
                            }
                        }
                        start++;
                        end--;
                        K--;
                    }
                    if (isPalin(String.copyValueOf(arr)))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else{
                    int start = 0, end = N - 1;
                    while (K > 0) {
                        if(start < end) {
                            char ch1 = arr[start];
                            char ch2 = arr[end];
                            if (ch1 != ch2) {
                                if (ch1 == '1')
                                    arr[start] = '0';
                                else
                                    arr[start] = '1';
                            }
                        }
                        start++;
                        end--;
                        K--;
                    }
                    if (isPalin(String.copyValueOf(arr)))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        }
    }
}
