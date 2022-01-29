package Januar_Lunch_Time;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SUBPERM {
    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        permuteHelper(list, new ArrayList<>(), arr);
        return list;
    }

    private static void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int[] arr) {

        // Base case
        if (resultList.size() == arr.length) {
            list.add(new ArrayList<>(resultList));
        } else {
            for (int i = 0; i < arr.length; i++) {

                if (resultList.contains(arr[i])) {
                    // If element already exists in the list then skip
                    continue;
                }
                // Choose element
                resultList.add(arr[i]);
                // Explore
                permuteHelper(list, resultList, arr);
                // Unchoose element
                resultList.remove(resultList.size() - 1);
            }
        }
    }

    public static boolean check(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.lastIndexOf(list.get(i)) != i) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t >= 1 && t <= 1000) {
            for (int a = 1; a <= t; a++) {
                int N = sc.nextInt();
                int K = sc.nextInt();
                int[] arr = new int[N];
                for (int i = 0; i < N; i++){
                    arr[i] = i + 1;}
                    List<List<Integer>> permute = permute(arr);
                    int count = 1;
                    boolean result = false;
                    List<Integer> gaya = new ArrayList<>();
                    for (List<Integer> perm : permute) {
                        for (int i = 0; i < perm.size(); i++) {
                            List<Integer> list = new ArrayList<>();
                            for (int j = i + 1; j < perm.size(); j++) {
                                list.add(perm.get(j));
                            }
                            if (check(list))
                                count++;
                        }
                        if (count == K) {
                            result = true;
                            for (int i = 0; i < perm.size(); i++)
                                System.out.print(perm.get(i) + " ");
                            break;
                        } else {
                            result = false;
                        }
                    }
                    if (!result) {
                        System.out.println("-1");
                    }
                }
            }
        }
    }
