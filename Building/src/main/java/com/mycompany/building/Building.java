package com.mycompany.building;

class apartment extends Building{
    int no_of_apartments;
}

public class Building {
     int floor;
    
    public static void main(String[] args) {
        apartment a = new apartment();
        System.out.println("number of floors in this floor is : "+(a.floor=10));
        System.out.println("number of apartments is : "+(a.no_of_apartments=50));
    }
}