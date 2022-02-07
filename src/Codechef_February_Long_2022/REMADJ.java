package Codechef_February_Long_2022;
import java.util.*;
import java.lang.*;
class REMADJ {
    public static boolean identical(int[] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] != arr[i+1])
                return false;
        }
        return true;
    }
    public static int[] removeTheElement(int[] arr, int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
    public static int maximum(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int a = 1; a <= t; a++) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                // Checking if all elements are identical in the array
            //    if (identical(arr)) {
           //         System.out.println("0");
            //    } else if (n == 2) {
              //      System.out.println("1");
              //  }
          //  else {
                    int s = 0 , operation = 0 , max = maximum(arr) , i = 0;
                    while(i < n - 1){
                        int sum = arr[i] + arr[i + 1];
                        if(sum > max){
                            arr[i] = sum;
                            arr = removeTheElement(arr , i+1);
                            operation++;
                            n--;
                        }
                        if(n == 2) {
                            operation++;
                            break;
                        }
                        if(arr[s] == arr[s+1])
                            operation++;
                        i++;
                    }
                System.out.println(operation);
                }
          //  }
        }
        catch (Exception e){
            return;
        }
    }
}

