package com.mycompany.animal;

class herbivore extends Animal{
    @Override
    void eat(){
        System.out.println("Eats only Veg...");
}
}

class carnivore extends Animal{
    @Override
    void eat(){
        System.out.println("Eats only Meat...");
    }
}

class omnivore extends Animal{
    @Override
    void eat(){
        System.out.println("Both Grass and Meat...");
    }
}

public class Animal {

    void eat(){
        System.out.println("What do they eat...");
    }
    
    public static void main(String[] args) {
        Animal herb = new herbivore();
        Animal carn = new carnivore();
        Animal omni = new omnivore();
        herb.eat();
        carn.eat();
        omni.eat();
    }
}