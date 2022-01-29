package Januar_Lunch_Time;

import java.util.Scanner;

public class LOCKDRAW {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t >= 1 && t <= 1000){
            for(int a = 1 ; a <= t ; a++){
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                int sum1 = A + B , sum2 = B + C , sum3 = A + C;
                if(sum1 == C || sum2 == A || sum3 == B)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
