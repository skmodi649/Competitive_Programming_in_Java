package Codeforces_Round_771;

import java.util.Scanner;

public class Odd_Swap_Sort {
    public static boolean checksorted(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            boolean ans = false , even = false;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++)
                arr[i] = sc.nextInt();
            if(checksorted(arr)){
                System.out.println("YES");
                break;
            }
            for(int j = 0 ; j < n-1 ; j++){
                if(arr[j] > arr[j+1] && (arr[j]+arr[j+1])%2 != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if(checksorted(arr)){
                    ans = true;
                    break;
                }
            }
           if(ans)
               System.out.println("YES");
           else
               System.out.println("NO");
        }
    }
}
