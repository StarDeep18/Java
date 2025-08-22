package com.mycompany.inter3;

interface Area {
    public void findArea(double radius); 
}

class ShapeCalculator implements Area {

    @Override
    public void findArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public void findArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void findArea(double base, double height, boolean isTriangle) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

public class Inter3 {
    public static void main(String[] args) {
        ShapeCalculator shape = new ShapeCalculator();

        shape.findArea(5.0);                       
        shape.findArea(4.0, 6.0);                    
        shape.findArea(4.0, 3.0, true);              

    }
}
