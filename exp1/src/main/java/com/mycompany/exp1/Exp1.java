package com.mycompany.exp1;

import java.io.IOException;

class Test2 {
    void m() throws IOException{
        throw new IOException("device error"); // checked exception
    }

    void n(){
        try{
            m();
        }
        catch(IOException e){
            System.out.println("Shameless fellow pooja!");
        }
    }

    void p() {
        try {
            n(); // handled here in try-catch
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }
}
public class Exp1 {

    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.p();
        System.out.println("normal flow");
    }
}
