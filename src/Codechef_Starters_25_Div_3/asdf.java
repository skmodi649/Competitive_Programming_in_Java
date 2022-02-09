package Codechef_Starters_25_Div_3;

import java.util.Scanner;

public class asdf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i = 0 ; i < n ; i++){
                arr[i] = i;
                sum+=arr[i];
                if(sum == k)
                    break;
            }
            for(int i = 0 ; i < n ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
