package com.mycompany.en1;

class Info {
    private String name;
    private int roll;
    private double percentage;
    public Info(String name, int roll) {
        this.name = name;
        this.roll = roll;
        this.percentage = 0.0;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public void setMarks(double score) {
        if (score > 0) {
            percentage = (score / 3.0);
        } else {
            System.out.println("Invalid Mark");
        }
    }

    public void showGrade() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 30.0) {
            System.out.println("You got 'A+' grade");
        } else if (percentage >= 25.0) {
            System.out.println("You got 'A' grade");
        } else if (percentage >= 20.0) {
            System.out.println("You got 'B' grade");
        } else if (percentage >= 15.0) {
            System.out.println("You got 'C' grade");
        } else {
            System.out.println("You failed! Better luck next time!");
        }
    }
}

public class Stud {
    public static void main(String[] args) {
        Info inf = new Info("Deepak", 101);
        inf.setMarks(85);
        inf.showGrade();
    }
}