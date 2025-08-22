package com.mycompany.hospital_staff;

class Doctor extends Hospital_Staff{
    @Override
    void personal_details(){
        System.out.println("The name of the doctor is : Pooja");
        System.out.println("The age of the doctor is : 17");
    }
}

class Nurse extends Hospital_Staff{
    @Override
    void personal_details(){
        System.out.println("The name of the nurse is : Deepak");
        System.out.println("The age of the nurse is : 18");
    }
}
public class Hospital_Staff {

    void personal_details(){
        System.out.println("The name of the doctor is : Sruthi");
        System.out.println("The age of the doctor is : 17");
    }
    
    public static void main(String[] args) {
        Hospital_Staff doc = new Doctor();
        Hospital_Staff nur = new Nurse();
        doc.personal_details();
        System.out.println("-------------------");
        nur.personal_details();
    }
}