package Educational_Codeforces_Round_123;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        permuteHelper(list, new ArrayList<>(), arr, arr.length);
        return list;
    }

    private static void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int [] arr, int n){
        if(n == 0)
            return;
        // Base case
        if(resultList.size() == arr.length && anti_fibonacci(resultList)){
            list.add(new ArrayList<>(resultList));
            n--;
        }
        else{
            for(int i = 0; i < arr.length; i++){

                if(resultList.contains(arr[i]))
                {
                    // If element already exists in the list then skip
                    continue;
                }
                // Choose element
                resultList.add(arr[i]);
                // Explore
                permuteHelper(list, resultList, arr, n);
                // Unchoose element
                resultList.remove(resultList.size() - 1);
            }
        }
    }
    public static boolean anti_fibonacci(List<Integer> arr){
        int len = arr.size();
        int a = arr.get(0);
        int b = arr.get(1);
        for(int i = 2 ; i < len ; i++){
            int sum = a + b;
            if(sum == arr.get(i))
                return false;
            else{
                a = b;
                b = sum;
            }
        }
        return true;
    }
    public static void display(List<Integer> list){
        for(int i = 0 ; i < list.size() ; i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++)
                arr[i] = i + 1;
            List<List<Integer>> permute = permute(arr);
            for(int i = 0 ; i < n ; i++){
                display(permute.get(i));
            }
        }
    }
}
