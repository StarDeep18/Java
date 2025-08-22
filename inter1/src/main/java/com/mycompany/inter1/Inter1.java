package com.mycompany.inter1;

interface area{
    public void calculateArea();
}   

class rectangle implements area{
    private double length;
    private double breadth;
    
    public rectangle(double length,double breath){
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    public void calculateArea(){
        double area = length*breadth;
        System.out.println("Area of rectangle is : "+area);
    }
}

class circle implements area{
    private double radius;
    
    public circle(double radius){
        this.radius = radius;
    }
    
    public void calculateArea(){
        double area = Math.PI*radius*radius;
        System.out.println("Area of circle is : "+area);
    }
}

class triangle implements area{
    private double base;
    private double height;
    
    public triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    
    public void calculateArea(){
        double area = 0.5*base*height;
        System.out.println("Area of the triangle is : "+area);
    }
}

class square implements area{
    private double side;
    
    public square(double side){
        this.side = side;
    }
    
    public void calculateArea(){
        double area = side*side;
        System.out.println("Area of the square : "+area);
    }
}


public class Inter1 {
    public static void main(String[] args) {
        area r = new rectangle(1,3);
        area c = new circle(20);
        area t = new triangle(2,5);
        area s = new square(7);
        r.calculateArea();
        c.calculateArea();
        t.calculateArea();
        s.calculateArea();
    }
}