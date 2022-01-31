package Educational_Codeforces_Round_122;

import java.util.Scanner;

public class Kill_the_Monster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a = 1 ; a <= t ; a++){
            int hc = sc.nextInt();
            int dc = sc.nextInt();
            int hm = sc.nextInt();
            int dm = sc.nextInt();
            int coins = sc.nextInt();
            int attackadded = sc.nextInt();
            int healthadded = sc.nextInt();
            hc = hc + coins * healthadded;
            dc = dc + coins * attackadded;
            int chance = 1;
            while(hc > 0 && hm > 0){
                if(chance % 2 != 0){
                    hm = hm - dc;
                    chance++;
                }
                else{
                    hc = hc - dm;
                    chance++;
                }
            }
            if(hc <= 0)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
