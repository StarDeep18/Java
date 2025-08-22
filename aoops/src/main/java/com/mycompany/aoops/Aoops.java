package com.mycompany.aoops;

interface Worker{
    void work();
}

abstract class Person{
    protected String name;
    protected int age;

    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    abstract void Detail();
}

class Employee extends Person implements Worker{
    private String department;
    
    public Employee(String name, int age, String department){
        super(name,age);
        this.department = department;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public String setDepartment(String dept){
        this.department = dept; 
        return null;
    }
    
    @Override
    void Detail(){
        System.out.println("Employee name is : "+name+ ", Age is : "+age+", department is : "+department);
    }
    
    @Override
    public void work(){
        System.out.println(name+" is workling in "+department+" department");
    }
    
    public void work(int hours){
        System.out.println(name+" is working for "+hours+" hours a day");
    }
}

class Manager extends Employee{
    private String exp;

    public Manager(String name, int age, String department, String exp) {
        super(name, age, department);
        this.exp = exp;
    }
    
    @Override
    void Detail(){
        super.Detail();
        System.out.println("Level : "+exp);
    }
}

public class Aoops {

    public static void main(String[] args) {
        Employee e = new Employee("Deepak",18,"Debugging");
        e.Detail();
        e.work();
        e.work(8);
        
        System.out.println();
        
        Manager m = new Manager("Poojitha",17,"Development","Senior");
        m.Detail();
    }
}
