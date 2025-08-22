package com.mycompany.retry;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
public class Retry {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for(int i = 0 ; i < test ; i++){
            int coder = scan.nextInt();
            int math = scan.nextInt();
            int other = scan.nextInt();
            int tot = coder + math + other;
            int team = Math.min(coder,Math.min(math, tot/3));
            System.out.println(team);
        }
    }
}