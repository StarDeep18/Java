package com.mycompany.polymorphism;

class Gun{
    void display(){
        System.out.println("...Details of the Guns...");
}
}

class pistol extends Gun{
    void display(){
        System.out.println("This is a D-gle");
        System.out.println("This is a USP");
        System.out.println("This is a glock");
    }
}

class shoty extends Gun{
    void display(){
        System.out.println("This is a M1014");
        System.out.println("This is a M1887");
        System.out.println("This is a Spas12");
    }
}

class sniper extends Gun{
    void display(){
        System.out.println("This is a AWM");
        System.out.println("This is a M82b");
        System.out.println("This is a Kar-98");
    }
}

public class Polymorphism {
    public static void main(String[] args){
        Gun s = new sniper();
        s.display();
        System.out.println("-------------------------------");
        Gun sh = new shoty();
        sh.display();
        System.out.println("-------------------------------");
        Gun p = new pistol();
        p.display();
    }
}