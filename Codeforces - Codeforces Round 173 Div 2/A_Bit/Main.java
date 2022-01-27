//  A. Bit++

import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for (int a = 1; a <= n; a++) {
            String operate = sc.next();
            String prefix = operate.substring(0, 2);
            String suffix = operate.substring(1, 3);
            if (prefix.equals("++")) 
                ++x;

            else if(prefix.equals("--"))
                --x;

            else if(suffix.equals("++"))
                x++;

            else
                x--;

        }
        System.out.println(x);
    }
}