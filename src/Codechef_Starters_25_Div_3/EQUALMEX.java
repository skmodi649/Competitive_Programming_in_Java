package Codechef_Starters_25_Div_3;

import java.util.*;

public class EQUALMEX {
    static Scanner sc = new Scanner(System.in);
    private static void solution() {
        TreeMap<Integer, Integer> field = new TreeMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n; i++) {
            int next = sc.nextInt();
            field.put(next, field.getOrDefault(next, 0) + 1);
        }
        boolean found = true;
        for (int i = 0; i < field.entrySet().size(); i++) {
            if (!field.containsKey(i)) {
                break;
            }
            if (field.get(i) == 1) {
                found = false;
                break;
            }
        }
        validate(found);
    }
    private static void validate(boolean found) {
        String result = found ? "YES" : "NO";
        System.out.println(result);
    }

    public static String repeat() {
        return null;
    }

    public static void main(String[] args){
        int t = sc.nextInt();
        while (t-- > 0)
            solution();
    }
}
