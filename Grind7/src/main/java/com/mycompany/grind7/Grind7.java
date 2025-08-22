
package com.mycompany.grind7;

import java.util.Scanner;

public class Grind7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for(int i = 0 ; i < test ; i++){
            int num = scan.nextInt();
            int[] res = new int[num];
            for(int j = 0 ; j < num ; j++){
                res[i] = scan.nextInt();
            }
            int ans = -1;
            
            for(int x = 0 ; x < 256 ; x++){
                int tot = 0;
                for(int k = 0 ; k < num ; k++){
                    int fin = res[i] ^ x;
                    tot = tot ^ fin;
                }
                if(tot == 0){
                    ans = x;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}