package com.mycompany.hyra;

import java.util.Scanner;

class shoe{
    
    Scanner scan = new Scanner(System.in);
    
    void display(){
        System.out.println("The list of Shoes are....");
    }
}

class brand extends shoe{
    void show(){
        System.out.println("Enter the brand of the shoe : ");
        String brand = scan.nextLine(); 
        System.out.println("The brand is : "+brand);
    }
}

class price extends shoe{
    void look(){
        System.out.println("Enter the price range of the shoe : ");
        double price = scan.nextDouble();
        System.out.println("The price range is : "+price);
    }}

public class Hyra {
    public static void main(String[] args) {
        brand b = new brand();
        price p = new price();
        b.show();
        p.look();
    }
}
