package Codechef_Starters_25_Div_3;

import java.util.Scanner;

public class TOWERTOP {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] SOLUTION) {

        int t = sc.nextInt();
        while (t-- > 0)
            hogaya();
    }

    private static synchronized void hogaya() {
        int target = sc.nextInt();
        long operations = sc.nextLong();
        int val = inferior(target);
        if (val <= operations)
            System.out.println(operations - val + 1);
        else
            System.out.println(0);
    }

    public static int inferior(int n) {
        int min = 0;
        for (int i = 0; i < 32; i++) {
            if ((1 << i) == n) {
                return (i + 1);
            }
            if (((1 << i) & n) == (1 << i)) {
                if (n == i) {
                    min = i;
                } else
                    min = i + 1;

            }
        }
        return min + 1;
    }

}
