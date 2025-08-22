package com.mycompany.basics;
import java.util.Scanner;


public class Basics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name  = scan.nextLine();
        
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        
        System.out.print("Enter your Aadhaar no : ");
        int aadhaar = scan.nextInt();
        
        System.out.println("Your name : "+name+"Your Age : "+age+"Your aadhaar number : "+aadhaar);
    }
}
