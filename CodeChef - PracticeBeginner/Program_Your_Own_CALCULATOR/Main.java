//  Program Your Own CALCULATOR

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        char C = sc.next().charAt(0);
        if(C == '+')
            System.out.println(A+B);
        else if(C == '-')
            System.out.println(A-B);
        else if(C == '*')
            System.out.println(A*B);
        else
            System.out.println((double)(A/B));
    }
}