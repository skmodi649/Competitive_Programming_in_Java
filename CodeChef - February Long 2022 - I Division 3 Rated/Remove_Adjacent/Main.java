//  Remove Adjacent

import java.util.*;
import java.lang.*;
class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int a = 1; a <= t; a++) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();

                // Checking if all elements are identical in the array
                int sumOfArray = 0, count = 0;
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] == arr[i + 1])
                        count++;
                }
                if (count == n - 1) {
                    System.out.println("0");
                } else if (n == 2) {
                    System.out.println("1");
                } else {
                    for(int x = 0 ; x < n ; x++)
                        sumOfArray+=arr[x];
                    int max = arr[0];
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > max)
                            max = arr[i];
                    }
                    double val = sumOfArray / max;
                    double floorval = Math.floor(val);
                    if((val-floorval) == 0.0)
                        System.out.println((int)(val-1));
                    else
                        System.out.println("0");
                }
            }
        }
        catch (Exception e){
            return;
        }
    }
}