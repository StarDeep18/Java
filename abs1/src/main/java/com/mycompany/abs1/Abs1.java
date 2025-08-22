package com.mycompany.abs1;

abstract class Employee{
    protected String name;
    protected int id;
    
    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
    
    public void info(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
    }
    
    abstract void calculateSalary();
}

class FullTime extends Employee{
    private int DailyHour = 8;
    public FullTime(String name,int id){
        super(name,id);
    }
    
    @Override
    public void calculateSalary(){
        double salary = 50000.0;
        System.out.println("Full-time salary : Rs."+salary);
    }
}

class PartTime extends Employee{
    private int DailyHour = 6;
    private double DailyWage = 3000.0;
            
            
    public PartTime(String name,int id){
        super(name,id);
    }
    
    @Override
    public void calculateSalary(){
        double salary = (DailyHour * DailyWage);
        System.out.println("Part-time salary : Rs."+salary);
    }
}

public class Abs1 {

    public static void main(String[] args) {
        FullTime ft = new FullTime("Deepak",101);
        ft.info();
        ft.calculateSalary();
        
        System.out.println();
        
        PartTime pt = new PartTime("Deepak",102);
        pt.info();
        pt.calculateSalary();
    }
}
