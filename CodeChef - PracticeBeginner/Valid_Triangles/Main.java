//  Valid Triangles

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a = 1 ; a <= t ; a++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x + y + z == 180)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}