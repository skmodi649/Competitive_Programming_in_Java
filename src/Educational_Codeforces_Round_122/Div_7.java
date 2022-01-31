package Educational_Codeforces_Round_122;

import java.util.Scanner;

public class Div_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a = 1 ; a <= t ; a++){
            int n = sc.nextInt();
            if(n % 7 == 0){
                System.out.println(n);
            }
            else{
                String val = Integer.toString(n);
                int len = val.length();
                int max = (int)Math.pow(10,len);
                int lower = max / 10;
                int upper = max - 1;
                while(n > 0){
                    boolean res = false;
                    int count = 0;
                    int d = n % 10;
                    n = n / 10;
                    while(count <= 9){
                        int vala = n * 10 + count;
                        if(vala % 7 == 0){
                            System.out.println(vala);
                            res = true;
                            break;
                        }
                        else{
                            count++;
                        }
                    }
                    if(res)
                        break;
                }
            }
        }
    }
}
