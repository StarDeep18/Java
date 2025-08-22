package com.mycompany.en1;

class Bank{
    private String AccName;
    private int AccNumber;
    private double balance;


public Bank(String AccName,int AccNumber){
    this.AccName = AccName;
    this.AccNumber = AccNumber;
    this.balance = 0.0;
}

public String AccName(){
    return AccName;
}

public double balance(){
    return balance;
}

public void deposite(double amount){
    if(amount > 0){
        balance += amount;
        System.out.println("Rs"+amount+"successfully deposited!");
    }
    else{
        System.out.println("Invalid amount entered!");
    }
}

public void withdraw(double amount){
    if(amount > 0 && amount <= balance){
        balance -= amount;
        System.out.println("Rs"+amount+"successsfully withdrawn!");
    }
    else{
        System.out.println("Invalid amount entered!");
    }
}

}

public class En1 {

    public static void main(String[] args) {
        Bank acc = new Bank("Deepak",12425352);
        acc.deposite(1000);
        acc.withdraw(999);
        System.out.println("Final Balance : "+acc.balance());
    }
}
