//  Remove Adjacent

import java.util.*;
import java.lang.*;
class Main {
    public static boolean identical(List<Integer> list){
        for(int i = 0 ; i < list.size() - 1 ; i++){
            if(list.get(i) != list.get(i + 1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int a = 1; a <= t; a++) {
                int n = sc.nextInt();
                int max = Integer.MIN_VALUE;
                int[] arr = new int[n];
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                for(int i = 0 ; i < n ; i++)
                    list.add(arr[i]);

                // Checking if all elements are identical in the array
                if (identical(list)) {
                    System.out.println("0");
                } else if (n == 2) {
                    System.out.println("1");
                } else {
                    for(int i = 0 ; i < n ; i++){
                        if(arr[i] > max)
                            max = arr[i];
                    }
                    int s = 0 , operation = 0;
                    while(s < list.size()){
                        if(list.get(s)+ list.get(s+1) == max){
                            list.add(s,max);
                            list.remove(s+1);
                            operation++;
                        }
                        if(list.get(s)+list.get(s+1) > max){
                            list.add(s, list.get(s)+list.get(s+1));
                            list.remove(s+1);
                            operation++;
                        }
                        s++;
                    }
                    System.out.println(operation);
                }
            }
        }
        catch (Exception e){
            return;
        }
    }
}