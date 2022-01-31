//  C. Kill the Monster

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a = 1 ; a <= t ; a++){
            int character_health = sc.nextInt();
            int character_attack = sc.nextInt();
            int monster_health = sc.nextInt();
            int monster_attack = sc.nextInt();
            int coins = sc.nextInt();
            int attackadded = sc.nextInt();
            int healthadded = sc.nextInt();
            character_health = character_health + (coins * healthadded);
            character_attack = character_attack + (coins * attackadded);
            int chance = 1;
            while(character_health > 0 && monster_health > 0){
                if(chance % 2 != 0){
                    monster_health = monster_health - character_attack;
                    chance++;
                }
                else{
                    character_health = character_health - monster_attack;
                    chance++;
                }
            }
            if(character_health <= 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}