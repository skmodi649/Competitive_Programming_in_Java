//  Turbo Sort

import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int val = sc.nextInt();
            list.add(val);
        }
        Collections.sort(list);
        for(int i = 0 ; i < n ; i++)
            System.out.println(list.get(i));
    }
}