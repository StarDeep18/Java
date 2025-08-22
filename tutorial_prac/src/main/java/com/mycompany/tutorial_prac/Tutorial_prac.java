package com.mycompany.tutorial_prac;
import java.util.Scanner;
public class Tutorial_prac {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            if(i<10){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            if(i>=10 && i<100){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            if (i>=100 && i<1000) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            if(i>=1000 && i<10000){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}