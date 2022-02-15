package Codeforces_Round_771;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void printarray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++)
                arr[i] = sc.nextInt();
            if(n == 1)
                System.out.println(arr[0]);
            else {
                boolean res = false;
                for (int i = 0; i < n-1; i++) {
                    int[] buffer = new int[n];
                    System.arraycopy(arr, 0, buffer, 0, n);
                    int temp = buffer[i];
                    buffer[i] = buffer[i+1];
                    buffer[i+1] = temp;
                    if (buffer[i] < arr[i]) {
                        res = true;
                        printarray(buffer);
                        break;
                    }
                }
                if(!res)
                    printarray(arr);
            }
        }
    }
}
