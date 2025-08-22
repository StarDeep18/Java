package com.mycompany.abs2;

abstract class employee{
    String name;
    int id;
    
    public employee(String name,int id){
        this.name = name;
        this.id = id;
    }
    
    abstract void calculateSalary();
    
    public void display(){
        System.out.println("Name is : "+name);
        System.out.println("Id is : "+id);
    }
}

class permanentemp extends employee{
    private double salary = 50000.0;
    
    public permanentemp(String name, int id) {
        super(name, id);
    }
    void calculateSalary(){
        display();
        System.out.println("Monthly salary : "+salary);
    }
}

class partTimeemp extends employee{
    private int dailyHour = 8;
    private double dailyWage = 3000.0;
    private double salary = dailyHour*dailyWage;
    
    public partTimeemp(String name,int id){
        super(name,id);
    }
    void calculateSalary(){
        display();
        System.out.println("Hourly Salary : "+salary);
    }
}

public class Abs2 {

    public static void main(String[] args) {
        permanentemp p = new permanentemp("Deepak",101);
        p.calculateSalary();
        
        System.out.println();
        
        partTimeemp e = new partTimeemp("Deepak",102);
        e.calculateSalary();
    }
}
